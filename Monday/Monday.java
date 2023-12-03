
import java.util.Scanner;
import java.time.LocalTime;

interface Alarm {
    void setAlarm(String time);

    void showAlarm();
}

abstract class Weekday implements Alarm {
}

public class Monday extends Weekday {

    private String time;

    public void setAlarm(String time) {
        this.time = time;
    }

    public void showAlarm() {
        try {
            LocalTime alarm = LocalTime.parse(time);
            LocalTime now = LocalTime.now();

            if (alarm.isAfter(now) && alarm.isBefore(now)) {
                System.out.println("Alarm is set for tomorrow!");
            } else {
                System.out.println("I'll wake you up later!");
            }
        } catch (Exception e) {
            System.out.println("Invalid time format. Please use HH:MM");
        }
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Time for alarm in this format (HH:MM): ");
            String alarm = user.nextLine();

            if (alarm.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            Monday monday = new Monday();
            monday.setAlarm(alarm);
            monday.showAlarm();
        }

    }
}
