package letscode.javalearn.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private LocalDateTime timeTag;
    private String description;

    public Event(UUID id, LocalDateTime timeTag, String description) {
        this.id = id;
        this.timeTag = timeTag;
        this.description = description;

        System.out.printf("Generated %s", id.toString());
    }
}
