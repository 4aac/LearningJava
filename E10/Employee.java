public abstract class Employee {
    protected String name;
    protected int age;
    protected boolean university;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double salary();

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", university=" + university + "}";
    }
}
