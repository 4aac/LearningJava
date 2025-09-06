public class Manager extends Employee {
    private int plus;

    public Manager(String name, int age, int plus) {
        super(name, age);
        this.plus = plus;
    }

    @Override
    public double salary() {
        return 1000 * this.age / 100.0 + this.plus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', age=" + age + ", plus=" + plus + ", salary=" + salary() + "}";
    }
}
