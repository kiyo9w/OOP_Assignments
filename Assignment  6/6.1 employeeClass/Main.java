package employeeClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
                Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
                Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

                displayEmployeeInfo(employee1);
                displayEmployeeInfo(employee2);
                displayEmployeeInfo(employee3);
            }

            public static void displayEmployeeInfo(Employee employee) {
                System.out.printf(" Name: "    + employee.getName());
                System.out.printf(" | ID Number: " + employee.getIdNumber());
                System.out.printf(" | Department: " + employee.getDepartment());
                System.out.printf(" | Position: " + employee.getPosition());
                System.out.println();
        }
    }