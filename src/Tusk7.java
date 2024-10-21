import java.util.Scanner;

public class Tusk7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                t[i][j] = sc.nextInt();

        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                t[i][j] += Math.max(t[i + 1][j], t[i + 1][j + 1]);
        System.out.println(t[0][0]);







        //это ужас. вроде правильно сделал,  обрабатывая треугольник снизу вверх




    }
}