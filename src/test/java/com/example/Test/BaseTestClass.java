//
//
// BaseTestClass.java
//
// Created by Caleb Tillman on 2/17/2020
// Copyright © 2020 Kin+Carta. All rights reserved.
//
//

package com.example.Test;


import com.example.docTest.FraudController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestClass {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}
