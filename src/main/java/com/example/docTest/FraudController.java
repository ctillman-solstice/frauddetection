//
//
// FraudController.java
//
// Created by Caleb Tillman on 2/17/2020
// Copyright © 2020 Kin+Carta. All rights reserved.
//
//

package com.example.docTest;

import com.example.Test.LoanRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudController {

    @PutMapping(value = "/fraudcheck", consumes="application/json", produces="application/json;charset=UTF-8")
    public String check(@RequestBody LoanRequest loanRequest) {

        if (loanRequest.getLoanAmount() > 10000) {
            return "{fraudCheckStatus: FRAUD, rejection.reason: Amount too high}";
        } else {
            return "{fraudCheckStatus: OK, acceptance.reason: Amount OK}";
        }
    }
}
