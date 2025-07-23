package org.example.events;


import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent {
    private UUID orderId;
    private Long customerId;
    private List<OrderItemDTO> items;
    private String couponCode;
    private BigDecimal totalAmount;
    private UUID transactionId;
}
