package com.djuka.fizzbuzzapi;

import java.util.Objects;

public class FizzBuzz {

    private String output;

    public FizzBuzz() {
    }
    public FizzBuzz(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizzBuzz fizzBuzz = (FizzBuzz) o;
        return Objects.equals(output, fizzBuzz.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output);
    }
}
