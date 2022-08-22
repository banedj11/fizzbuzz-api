package com.djuka.fizzbuzzapi;

import com.djuka.fizzbuzzapi.error.InvalidParameterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FizzBuzzResource {

    private static final String ONLY_NUMBER_REGEX = "[0-9]+";

    private final FizzbuzzService fizzbuzzService;

    public FizzBuzzResource(FizzbuzzService fizzbuzzService) {
        this.fizzbuzzService = fizzbuzzService;
    }

    @GetMapping("/fizzbuzz")
    public ResponseEntity<FizzBuzz> fizzbuzz(@RequestParam String entry) {
        if(entry == null || entry.isEmpty()) {
            return new ResponseEntity(fizzbuzzService.getAllOutputs(), HttpStatus.OK);
        }
        if(!entry.matches(ONLY_NUMBER_REGEX)) {
            throw new InvalidParameterException("Entry must be numeric");
        }
        FizzBuzz fizzBuzz = fizzbuzzService.getOutput(entry);
        return new ResponseEntity(fizzBuzz, HttpStatus.OK);
    }
}
