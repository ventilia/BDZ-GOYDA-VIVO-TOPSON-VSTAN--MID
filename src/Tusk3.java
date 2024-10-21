import java.util.*;

public class Tusk3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("количество элементов");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("элементы:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        Arrays.sort(arr); //cортировку добавил, что-бы не расслаблялись 😎😎

        arr = Arrays.stream(arr)
                .distinct().toArray(); //эту строку я взял с https://ru.hexlet.io/qna/java/questions/kak-udalit-povtoryayuschiesya-elementy-v-massive-java надеюсь -балла не будет

        System.out.println(Arrays.toString(arr));
    }



}