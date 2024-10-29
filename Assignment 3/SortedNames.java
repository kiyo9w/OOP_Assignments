import java.util.Arrays;
import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String name1 = input.nextLine();
        System.out.print("Enter the second name: ");
        String name2 = input.nextLine();
        System.out.print("Enter the third name: ");
        String name3 = input.nextLine();
        String[] names = { name1, name2, name3 };
        Arrays.sort(names);
        System.out.println("\nNames in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
        input.close();
    }
}
//3.7