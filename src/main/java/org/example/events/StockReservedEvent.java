package org.example.events;



import lombok.*;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockReservedEvent {
    private UUID orderId;
    private List<OrderItemDTO> items;
    private Long customerId;
}
