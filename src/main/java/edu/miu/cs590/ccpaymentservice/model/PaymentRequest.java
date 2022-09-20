package edu.miu.cs590.ccpaymentservice.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private String userId;
    private String ccId;
    private Double balance;
}
