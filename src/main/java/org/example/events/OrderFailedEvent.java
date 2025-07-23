package org.example.events;


import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderFailedEvent {
    private UUID orderId;
    private String reason;
    private UUID transactionId;
}
