package com.djuka.fizzbuzzapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@RestController
@Validated
public class FizzBuzzResource {

    private final FizzbuzzService fizzbuzzService;

    public FizzBuzzResource(FizzbuzzService fizzbuzzService) {
        this.fizzbuzzService = fizzbuzzService;
    }

    @GetMapping("/fizzbuzz")
    public ResponseEntity fizzbuzz(@RequestParam @Positive(message = "Must be a number")  String entry) {
        FizzbuzzOutput output = fizzbuzzService.getOutput(entry);
        return new ResponseEntity<FizzbuzzOutput>(output, HttpStatus.OK);
    }
}
