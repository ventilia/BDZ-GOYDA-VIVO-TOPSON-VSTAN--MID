
import java.util.Scanner;

public class Tusk10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baz = scanner.nextLine();
        String text = scanner.nextLine();

        res(baz, text);
    }

    public static void res(String baz, String text) {
        boolean a = false;
        for (int i = 0; i <= baz.length() - text.length(); i++) {
            if (baz.substring(i, i + text.length()).equals(text)) {
                System.out.print(i + " ");
                a = true;
            }
        }
        if (!a) {
            System.out.println("-1");
        }
    }
}


//оцущпкшщвеое9 ):