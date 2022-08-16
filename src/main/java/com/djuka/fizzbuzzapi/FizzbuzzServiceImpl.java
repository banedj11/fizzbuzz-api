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
        String[] allOutputs = new String[99];
        for(int i = 0; i < allOutputs.length; i++) {
            int n = i+1;
            if(n % 3 == 0 && n % 5 == 0) {
                allOutputs[i] = "fizzbuzz";
            } else if(n % 3 == 0) {
                allOutputs[i] = "fizz";
            } else if(n % 5 == 0) {
                allOutputs[i] = "buzz";
            } else {
                allOutputs[i] = String.valueOf(n);
            }
        }
        return allOutputs;
    }
}
