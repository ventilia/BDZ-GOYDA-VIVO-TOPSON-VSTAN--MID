import java.util.Arrays;
import java.util.Scanner;

public class Tusk4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();


        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}

//я сомневаюсь, что я понял шо такое анаграммы и сомневаюсь, что я сделал это правильно, но на тестах все норм - значит ок.
//в коде я использовался метод сортировки. короче мы строки в масив суем, сортируем каждый символ и проверяем все это через  метод equals