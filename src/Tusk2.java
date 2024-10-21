import java.util.Scanner;
public class Tusk2 {

    public static String resh(String input) {



        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                res.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        res.append(input.charAt(input.length() - 1)).append(count);
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String res = resh(input);
        System.out.println(res);
    }
}


//про сам принцип (и немного кода для вдохновения) я познавал тут https://www.baeldung.com/java-rle-compression.
//и иные способы решения я смотрел https://stackoverflow.com/questions/11442162/java-run-length-encoding но там либо какие-то гении сидят, либо дегенераты полные.
//каждую строку и метод объяснить могу