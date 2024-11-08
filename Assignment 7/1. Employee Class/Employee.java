public class Employee {
    private String firstName;
    private String lastname;
    private double monthySalary;

    public Employee(String firstName, String lastname, double monthySalary) {
        this.firstName = firstName;
        this.lastname = lastname;
        if (monthySalary >= 0) {
            this.monthySalary = monthySalary;
        } else {
            this.monthySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastname;
    }
    public double getMonthySalary() {
        return monthySalary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setMonthySalary(double monthySalary) {
        if (monthySalary >= 0) {
            this.monthySalary = monthySalary;
        }
    }
    public double getYearlySalary() {
        // yearly bonus
        return monthySalary * 13;
    }
    public void giveRaise(double raisePercentage) {
        this.monthySalary += monthySalary * raisePercentage/100;
    }
}
