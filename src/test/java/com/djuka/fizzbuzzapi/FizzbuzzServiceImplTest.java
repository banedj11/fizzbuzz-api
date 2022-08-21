package com.djuka.fizzbuzzapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class FizzbuzzServiceImplTest {

    @Autowired
    private FizzbuzzServiceImpl underTest;

    @Test
    void outputShouldBeFizzBuzz() {
        String entry = "15";
        FizzBuzz fizzBuzz = underTest.getOutput(entry);
        assertThat(fizzBuzz.getOutput()).isEqualTo("fizzbuzz");
    }

    @Test
    void outputShouldBeFizz() {
        String entry = "6";
        FizzBuzz fizzBuzz = underTest.getOutput(entry);
        assertThat(fizzBuzz.getOutput()).isEqualTo("fizz");
    }

    @Test
    void outputShouldBeBuzz() {
        String entry = "10";
        FizzBuzz fizzBuzz = underTest.getOutput(entry);
        assertThat(fizzBuzz.getOutput()).isEqualTo("buzz");
    }

    @Test
    void outputShouldBeGivenEntry() {
        String entry = "13";
        FizzBuzz fizzBuzz = underTest.getOutput(entry);
        assertThat(fizzBuzz.getOutput()).isEqualTo("13");
    }

    @Test
    void shouldReturnAllPossibleOutputs() {
        FizzBuzz fizzBuzz = underTest.getAllOutputs();
        String expectedOutput = "[1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22, 23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz, fizz, 37, 38, fizz, buzz, 41, fizz, 43, 44, fizzbuzz, 46, 47, fizz, 49, buzz, fizz, 52, 53, fizz, buzz, 56, fizz, 58, 59, fizzbuzz, 61, 62, fizz, 64, buzz, fizz, 67, 68, fizz, buzz, 71, fizz, 73, 74, fizzbuzz, 76, 77, fizz, 79, buzz, fizz, 82, 83, fizz, buzz, 86, fizz, 88, 89, fizzbuzz, 91, 92, fizz, 94, buzz, fizz, 97, 98, fizz, buzz]";
        assertThat(fizzBuzz.getOutput()).isEqualTo(expectedOutput);
    }

    @Test
    void assignedOutputShouldBeFizzbuzz() {
        int entry = 15;//given
        String output = underTest.assignOutput(entry);//when
        assertThat(output).isEqualTo("fizzbuzz");//then
    }

    @Test
    void assignedOutputShouldBeFizz() {
        int entry = 3;//given
        String output = underTest.assignOutput(entry);//when
        assertThat(output).isEqualTo("fizz");//then
    }

    @Test
    void assignedOutputShouldBeBuzz() {
        int entry = 5;//given
        String output = underTest.assignOutput(entry);//when
        assertThat(output).isEqualTo("buzz");//then
    }

    @Test
    void assignedOutputShouldBeGivenEntry() {
        int entry = 8;//given
        String output = underTest.assignOutput(entry);//when
        assertThat(output).isEqualTo("8");//then
    }
}