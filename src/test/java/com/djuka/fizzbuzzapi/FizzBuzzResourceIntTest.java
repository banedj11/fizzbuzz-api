package com.djuka.fizzbuzzapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.core.Is.is;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class FizzBuzzResourceIntTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FizzbuzzService fizzbuzzService;

    @Test
    void whenParamIsNumber_StatusOk() throws Exception {
        mvc.perform(get("/fizzbuzz?entry=15"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.output", is("fizzbuzz")));
    }
}