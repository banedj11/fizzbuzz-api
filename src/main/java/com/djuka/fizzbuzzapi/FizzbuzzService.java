package com.djuka.fizzbuzzapi;

public interface FizzbuzzService {

    FizzbuzzOutput getOutput(String entry);
    String[] getAllOutputs();
}
