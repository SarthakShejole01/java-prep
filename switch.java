public class Switch {
    public static void main(String[] args) {
        int marks = 70;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        String day = "Sat";

        String type = switch (day) {
            case "Sat", "Sun" -> "weekend";
            case "Mon", "Tue", "Wed", "Thu", "Fri" -> "weekday";
            default -> "Unknown";
        };
        System.out.println(type);
    }
}