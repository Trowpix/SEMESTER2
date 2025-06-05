package Kuliah.Praktikums.Praktikum9A;

import java.util.*;

public class Main {
    static class Event {
        String type;
        String message;
        int severity;

        Event(String type, String message, int severity) {
            this.type = type;
            this.message = message;
            this.severity = severity;
        }
    }

    interface EventFilter {
        boolean accept(Event e);
    }

    interface EventFormatter {
        String format(Event e);
    }

    public static void main(String[] args) {
        List<Event> events = Arrays.asList(
                new Event("ERROR", "Database connection lost", 1),
                new Event("ERROR", "NullPointerException in job X", 2),
                new Event("WARN", "Disk usage at 85%", 2),
                new Event("WARN", "High memory usage detected", 4),
                new Event("ERROR", "PC core temp is over 9000", 1),
                new Event("INFO", "Storage is at it limit", 3)
        );

        EventFilter errorFilter = new EventFilter() {
            @Override
            public boolean accept(Event e) {
                return e.type.equalsIgnoreCase("ERROR") && e.severity <= 2;
            }
        };

        EventFilter warnFilter = e -> e.type.equalsIgnoreCase("WARN");

        List<Event> criticalErrors = new ArrayList<>();
        List<Event> warnings = new ArrayList<>();
        for (Event e : events) {
            if (errorFilter.accept(e)) criticalErrors.add(e);
            if (warnFilter.accept(e)) warnings.add(e);
        }

        EventFormatter formatter = e -> "[" + e.type + "|" + e.severity + "] " + e.message;

        System.out.println("=== Critical Errors ===");
        for (Event e : criticalErrors) {
            System.out.println(formatter.format(e));
        }

        System.out.println("\n=== Warnings ===");
        for (Event e : warnings) {
            System.out.println(formatter.format(e));
        }
    }
}
