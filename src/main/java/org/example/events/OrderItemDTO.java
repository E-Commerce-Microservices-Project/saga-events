package org.example.events;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDTO {
    private Long productId;
    private int quantity;
    private Long storeId;
}
