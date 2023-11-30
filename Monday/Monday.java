import java.time.LocalTime;
import java.util.Scanner;

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
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();

        if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else if (alarm.isAfter(now)) {
            System.out.println("I'll wake you up later!");
        } else {
            System.out.println("Valid");
        }

    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter Time for alarm in this format (HH:MM): ");
        String alarm = user.nextLine();

        Monday monday = new Monday();
        monday.setAlarm(alarm);
        monday.showAlarm();
    }

}
