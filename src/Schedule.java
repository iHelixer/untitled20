import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Schedule {

    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }


    public void addEvent(Event event) {
        events.add(event);
    }


    public List<Event> getEventsByDate(LocalDateTime date) {
        return events.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(date.toLocalDate()))
                .collect(Collectors.toList());
    }


    public void removePastEvents() {
        LocalDateTime now = LocalDateTime.now();
        events.removeIf(event -> event.getDateTime().isBefore(now));
    }


    public void printAllEvents() {
        if (events.isEmpty()) {
            System.out.println("Список заходів порожній.");
        } else {
            events.forEach(System.out::println);
        }
    }
}