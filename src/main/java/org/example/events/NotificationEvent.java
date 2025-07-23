package org.example.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEvent {
    private String recipient;
    private NotificationType type;
    private String subject;
    private String content;
    private Map<String, String> metadata;
}
