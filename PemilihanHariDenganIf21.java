import java.util.Scanner;

public class PemilihanHariDenganIf21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName;
        String dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextInt();

        if (dayName >= 1 && dayName <= 5) {
            dayType = "weekday";
        } else if (dayName == 6 || dayName == 7) {
            dayType = "weekday";
        } else {
            dayType = "invalid number";

    }
    System.out.println( dayName + " is a " + dayType);
}
}