package com.djuka.fizzbuzzapi;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzServiceImpl implements FizzbuzzService{

    @Override
    public FizzbuzzOutput getOutput(String entry) {
        FizzbuzzOutput fizzbuzzOutput = new FizzbuzzOutput();
        int entryNumber = Integer.parseInt(entry);
        if(entryNumber % 3 == 0 && entryNumber % 5 == 0) {
            fizzbuzzOutput.setOutput("fizzbuzz");
        } else if(entryNumber % 3 == 0) {
            fizzbuzzOutput.setOutput("fizz");
        } else if(entryNumber % 5 == 0) {
            fizzbuzzOutput.setOutput("buzz");
        } else {
            fizzbuzzOutput.setOutput(entry.toString());
        }
        return fizzbuzzOutput;
    }

    @Override
    public String[] getAllOutputs() {
        String[] allOutputs = new String[100];
        for(int i = 1; i < allOutputs.length; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                allOutputs[i] = "fizzbuzz";
            } else if(i % 3 == 0) {
                allOutputs[i] = "fizz";
            } else if(i % 5 == 0) {
                allOutputs[i] = "buzz";
            } else {
                allOutputs[i] = String.valueOf(i);
            }
        }
        return new String[0];
    }
}
