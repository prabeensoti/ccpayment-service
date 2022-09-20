package edu.miu.cs590.ccpaymentservice.controller;

import edu.miu.cs590.ccpaymentservice.model.PaymentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/ccPayments")
public class CCPaymentController {
    @PostMapping("/processPayment")
    public ResponseEntity<String> makePayment(@RequestBody PaymentRequest paymentRequest){
        return new ResponseEntity<>("Payment successful for ccId " + paymentRequest.getCcId() + " with UID " + UUID.randomUUID().toString(), HttpStatus.OK);
    }
}
