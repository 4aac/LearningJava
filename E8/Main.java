import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);
        List<String> queue = new ArrayList<>();

        while (cont) {
            System.out.println(
                "\nChoose an option\n" +
                "1) Print\n" +
                "2) Introduce file\n" +
                "3) Watch printing queue\n" +
                "4) Exit"
            );

            String input = scanner.nextLine();

            if (input.equals("1")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.get(0));
                    queue.remove(0);
                } else {
                    System.out.println("Queue is empty.");
                }
            } else if (input.equals("2")) {
                System.out.print("\nIntroduce the file name: ");
                String newFile = scanner.nextLine();
                queue.add(newFile);
                System.out.println("File added correctly.");
            } else if (input.equals("3")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    for (String file : queue) {
                        System.out.println(file);
                    }
                }
            } else if (input.equals("4")) {
                System.out.println("\nExiting...");
                cont = false;
            } else {
                System.out.println("Option not available");
            }
        }
        scanner.close();
    }
}
