import java.util.Scanner;

public class Tusk5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int mon = scanner.nextInt();
        int ye = scanner.nextInt();


        String[] arr = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        if (mon < 3) {
            mon += 12;
            ye -= 1;
        }
        int k = ye % 100;
        int j = ye / 100;


        int res = (day + (13 * (mon + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        System.out.println(arr[res]);
    }
}


//использовал формулу зеллера.  https://slovesnov.users.sourceforge.net/index.php%3Fcalendar_formula,russian    https://en.wikipedia.org/wiki/Zeller%27s_congruence