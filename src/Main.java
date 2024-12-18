import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();


        schedule.addEvent(new Event("Нарада з командою", LocalDateTime.of(2024, 12, 15, 10, 0), "Офіс"));
        schedule.addEvent(new Event("День народження", LocalDateTime.of(2024, 12, 20, 18, 30), "Ресторан"));
        schedule.addEvent(new Event("Презентація проекту", LocalDateTime.of(2025, 2, 19, 12, 0), "Конференц-зал"));

        System.out.println("Усі заходи:");
        schedule.printAllEvents();


        System.out.println("\nЗаходи на 15.12.2024:");
        List<Event> eventsOnDate = schedule.getEventsByDate(LocalDateTime.of(2024, 12, 15, 0, 0));
        eventsOnDate.forEach(System.out::println);


        System.out.println("\nВидалення заходів, дата яких минула...");
        schedule.removePastEvents();

       
        System.out.println("Актуальні заходи:");
        schedule.printAllEvents();
    }
}