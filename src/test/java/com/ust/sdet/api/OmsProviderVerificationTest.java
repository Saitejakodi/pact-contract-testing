//package com.ust.sdet.api;
//
//import au.com.dius.pact.provider.junit5.HttpTestTarget;
//import au.com.dius.pact.provider.junit5.PactVerificationContext;
//import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
//import au.com.dius.pact.provider.junitsupport.Provider;
//import au.com.dius.pact.provider.junitsupport.State;
//import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.TestTemplate;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//@Provider("OMS")
//@PactBroker(url = "http://localhost:9292")
//class OmsProviderVerificationTest {
//
//    @BeforeEach
//    void target(PactVerificationContext context) {
//        context.setTarget(
//                new HttpTestTarget(
//                        "localhost",
//                        4010,
//                        "/"
//                )
//        );
//    }
//
//    @TestTemplate
//    @ExtendWith(PactVerificationInvocationContextProvider.class)
//    void verify(PactVerificationContext context) {
//        context.verifyInteraction();
//    }
//
//    @State("order 123 exists")
//    void orderExists() {
//        // TODO:
//        // Insert order 123 into DB
//        // or create test data
//    }
//
//    @State("inventory available for SKU-9")
//    void inventoryAvailable() {
//        // TODO:
//        // Seed inventory for SKU-9
//    }
//
//    @State("SKU-9 has stock")
//    void skuHasStock() {
//        // TODO:
//        // Seed stock data
//    }
//}