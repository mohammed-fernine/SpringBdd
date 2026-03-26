package com.springassessment.springbdd;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.springassessment.springbdd.StepDefinition;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryStepDefination extends StepDefinition {

    @Autowired
    private MockMvc mvc;

    ResultActions action;

    @When("the client calls \\/getCategory")
    public void the_client_calls_getCategory() throws Exception {
        action=mvc.perform(get("/getCategory").contentType(MediaType.APPLICATION_JSON));
    }

    @Then("the client receives status code of {int} for category")
    public void the_client_receives_status_code_of_for_category(Integer int1) throws Exception {
        action.andExpect(status().isOk());
    }

    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) throws Exception {
        action.andExpect(status().isOk());
    }
    @Then("the client receives category with name")
    public void the_client_receives_category_with_name() throws Exception {
        // If the JSON returned is { "name": "Men" }, use "$.name"
        action.andExpect(jsonPath("$.name", org.hamcrest.Matchers.is("Men")));
    }
}
