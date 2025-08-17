import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int count1 = 0;
    public static int count2 = 0;

    public static List<Integer> exercise(String num1, String num2) {
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(num1 + " " + num2);
                count1 += 1;
                count2 += 1;
            } else if (i % 3 == 0) {
                System.out.println(num1);
                count1 += 1;
            } else if (i % 5 == 0) {
                System.out.println(num2);
                count2 += 1;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(count1);
        result.add(count2);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result_ex = exercise("Asier", "Aaron");

        System.out.println("\nResults");
        System.out.println(result_ex.get(0));
        System.out.println(result_ex.get(1));
    }
}
