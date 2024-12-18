import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Event {
    private String name;
    private LocalDateTime dateTime;
    private String location;

    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return String.format("Захід: [%s], Дата: [%s], Місце: [%s]", name, dateTime.format(formatter), location);
    }
}