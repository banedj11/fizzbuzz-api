package com.djuka.fizzbuzzapi;

import org.springframework.stereotype.Component;

@Component
public class FizzbuzzOutput {

    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
