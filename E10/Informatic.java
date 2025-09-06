public class Informatic extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Informatic(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double salary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Informatic{name='" + name + "', age=" + age + ", hourlyRate=" + hourlyRate +
               ", hoursWorked=" + hoursWorked + ", salary=" + salary() + "}";
    }
}
