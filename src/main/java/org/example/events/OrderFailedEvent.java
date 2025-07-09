package org.example.events;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderFailedEvent {
    private Long orderId;
    private String reason;
    private Long transactionId;
}
