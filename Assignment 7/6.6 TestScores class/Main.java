import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double CS310Score;
        double CS365Score;
        double CS360Score;
        Scanner sc = new Scanner(System.in);

        TestScore TrungTS = new TestScore(10, 10, 10);
        System.out.println(TrungTS.getAverageScore());

        System.out.print("Enter the first subject score: ");
        CS310Score = sc.nextDouble();

        System.out.print("Enter the second subject score: ");
        CS365Score = sc.nextDouble();

        System.out.print("Enter the third subject score: ");
        CS360Score = sc.nextDouble();

        TestScore Fall2024TrungTS = new TestScore(CS310Score, CS365Score, CS360Score);
        System.out.println("Your Fall 2024 average tests score: " + Fall2024TrungTS.getAverageScore());

        sc.close();
    }
}
