package com.example.task;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CountSettle.class)
public class CountSettleTest {

    @Autowired
    private CountSettle countSettle;

    private MockMvc mvc;

    @Test
    public void index() {
        countSettle.ddd();
    }
}