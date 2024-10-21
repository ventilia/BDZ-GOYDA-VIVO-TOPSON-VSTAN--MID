
import java.util.Scanner;

public class Tusk1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int res = 0;
        while(number != 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }
        System.out.println(res);

        //ну я думаю гпт бы посложнее сделал
    }
}