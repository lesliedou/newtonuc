package com.iresearch.uc.cucumber.stepdefs;

import com.iresearch.uc.NewtonucApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = NewtonucApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
