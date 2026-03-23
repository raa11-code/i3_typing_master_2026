package i3_typing_master_2026;

import java.util.ArrayList;
import java.util.List;

public class TestResults {
    
    public void showHistory() {
        System.out.println("\n--- [VUTHA DARALEAP] Your Test History ---");
        
        // Mock data representing a user's previous tests
        List<String> results = new ArrayList<>();
        results.add("2026-03-21 | 45 WPM | 92% Accuracy");
        results.add("2026-03-22 | 52 WPM | 95% Accuracy");
        results.add("2026-03-23 | 58 WPM | 98% Accuracy");

        if (results.isEmpty()) {
            System.out.println("No records found. Start a typing test to see results!");
        } else {
            System.out.println("----------------------------------------------");
            for (String record : results) {
                System.out.println(record);
            }
            System.out.println("----------------------------------------------");
        }
    }
}