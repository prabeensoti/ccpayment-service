package edu.miu.cs590.ccpaymentservice.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private Long userId;
    private String ccId;
    private Double balance;
}
