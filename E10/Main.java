public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 40, 700);
        Informatic informatic = new Informatic("John", 28, 25.0, 160);

        System.out.println(manager);
        System.out.println(informatic);

        Employee[] employees = {manager, informatic};
        double total = 0;
        for (Employee e : employees) {
            total += e.salary();
        }
        System.out.println("Total salaries: " + total);
    }
}
