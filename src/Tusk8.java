import java.util.Scanner;

public class Tusk8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        zxc(n, 'A', 'C', 'B');
    }
    public static void zxc(int n, char o, char qwe, char abc) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + o + " to " + qwe);
        } else {
            zxc(n - 1, o, abc, qwe);
            System.out.println("Move disk " + n + " from " + o + " to " + qwe);
            zxc(n - 1, abc, qwe, o);
        }
    }
}



// откуда я вспоминал про рекурсии и их принцип работы https://javarush.com/groups/posts/1895-rekursija-v-java
// https://habr.com/ru/articles/830620/