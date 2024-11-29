public class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Quang", "Huy", 3000);
        Employee employee2 = new Employee("Naruto", "Sasuke", 2500);

        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "'s yearly salary: " + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "'s yearly salary: " + employee2.getYearlySalary());

        employee1.applyRaise();
        employee2.applyRaise();

        System.out.println("After 10% raise:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "'s yearly salary: " + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "'s yearly salary: " + employee2.getYearlySalary());
    }
}