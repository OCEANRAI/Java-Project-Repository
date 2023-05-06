import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your date of birth (Year/Month/Day) order: ");

        String dobStr = scanner.nextLine();
        String[] dateArr = dobStr.split("/");

        if (dateArr.length != 3) {
            System.out.println("Invalid date format!");
            scanner.close();
            return;
        }

        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);

        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            scanner.close();
            return;
        }

        if (day < 1 || day > 31) {
            System.out.println("Invalid day!");
            scanner.close();
            return;
        }

        LocalDate dob = LocalDate.of(year, month, day);
        Period agePeriod = Period.between(dob, LocalDate.now());

        int age = agePeriod.getYears();

        System.out.println("You are " + age);

        scanner.close();
    }
}
