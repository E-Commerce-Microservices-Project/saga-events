package org.example.events;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderFailedEvent {
    private Long orderId;
    private String reason;
    private Long transactionId;
}
