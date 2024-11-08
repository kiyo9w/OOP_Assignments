public class EmployeeTest{
    public static void main(String[] args){
        Employee emp1101 = new Employee("Nguyen", "A", 90);
        Employee emp1100 = new Employee("Dao", "B", 1000);

        System.out.println("Salary of " + emp1101.getFirstName() + " " + emp1101.getLastName() + ": " + emp1101.getMonthySalary());
        System.out.println("Salary of " + emp1100.getFirstName() + " " + emp1100.getLastName() + ": " + emp1100.getMonthySalary());

        // give each employee a 10% raise
        emp1101.giveRaise(10);
        emp1100.giveRaise(10);

        emp1100.setMonthySalary(-90);
        emp1100.setFirstName("Tien");
        emp1101.setLastname("T");

        System.out.println("Salary of " + emp1101.getFirstName() + " " + emp1101.getLastName() + " after 10% raise: " + emp1101.getMonthySalary());
        System.out.println("Salary of " + emp1100.getFirstName() + " " + emp1100.getLastName() + " after 10% raise: " + emp1100.getMonthySalary());

        // display yearly salary after the raise
        System.out.println("Yearly salary of " + emp1101.getFirstName() + " " + emp1101.getLastName() + " after 10% raise: " + emp1101.getYearlySalary());
        System.out.println("Yearly salary of " + emp1100.getFirstName() + " " + emp1100.getLastName() + " after 10% raise: " + emp1100.getYearlySalary());
    }
}