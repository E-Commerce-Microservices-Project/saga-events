package org.example.events;


import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private Long orderId;
    private Long customerId;
    private List<OrderItemDTO> items;
    private String couponCode;
    private BigDecimal totalAmount;
    private Long transactionId;
}
