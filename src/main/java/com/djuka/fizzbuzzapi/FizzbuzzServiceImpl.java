package com.djuka.fizzbuzzapi;

import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class FizzbuzzServiceImpl implements FizzbuzzService{

    @Override
    public FizzBuzz getOutput(String entry) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int entryNumber = Integer.parseInt(entry);
        fizzBuzz.setOutput(assignOutput(entryNumber));

        return fizzBuzz;
    }

    @Override
    public FizzBuzz getAllOutputs() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] allOutputs = new String[100];
        for(int i = 0; i < allOutputs.length; i++) {
            int n = i+1;
            allOutputs[i] = assignOutput(n);
        }
        fizzBuzz.setOutput(Arrays.toString(allOutputs));

        return fizzBuzz;
    }

    public String assignOutput(int entry) {
        String output;
        if(entry % 3 == 0 && entry % 5 == 0) {
            output = "fizzbuzz";
        } else if(entry % 3 == 0) {
            output = "fizz";
        } else if(entry % 5 == 0) {
            output = "buzz";
        } else {
            output = String.valueOf(entry);
        }
        return output;
    }


}
