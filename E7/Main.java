public class Main {

    public static void recursive(int num) {
        if (num >= 0) { 
            System.out.println(num);
            num--;
            recursive(num);
        }
    } 

    public static long factorial(long num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        recursive(100);
        System.out.println(factorial(20));
        System.out.println(fibonacci(15));
    }
    
}
