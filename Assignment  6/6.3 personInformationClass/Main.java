package personInformationClass;

public class Main {
    public static void main(String[] args) {
        Person myInfo = new Person("Your Name", "123 Main St, Hometown", 30, "555-1234");
        Person friendInfo = new Person("Friend Name", "456 Maple Ave, Nearby Town", 25, "555-5678");
        Person familyMemberInfo = new Person("Family Member Name", "789 Oak Dr, Family Town", 55, "555-8765");

        displayPersonInfo(myInfo);
        displayPersonInfo(friendInfo);
        displayPersonInfo(familyMemberInfo);
    }

    public static void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Age: " + person.getAge());
        System.out.println("Phone Number: " + person.getPhoneNumber());
        System.out.println();
    }
}
