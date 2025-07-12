package org.example.events;



import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockReservedEvent {
    private Long orderId;
    private List<OrderItemDTO> items;
    private Long customerId;
}
