import java.util.Scanner;

public class Tusk9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] num = Long.toString(scanner.nextLong()).toCharArray();

        boolean[] us = new boolean[num.length];
        res(num, us, new StringBuilder());
    }

    private static void res(char[] num, boolean[] us, StringBuilder cur) {
        if (cur.length() == num.length) {
            System.out.println(cur);
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (!us[i]) {
                us[i] = true;
                cur.append(num[i]);
                res(num, us, cur);
                cur.deleteCharAt(cur.length() - 1);
                us[i] = false;
            }
        }
    }
}

//Сначала написал код через обычный перебор, но он не все значения принимал, а потом досилил рекурсию
//Как выглядит санузел панка? Он идеально чист... Потому что панк туда не ходит