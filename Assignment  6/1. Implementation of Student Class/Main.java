//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student Bob = new Student();
        Bob.setId("TROY1231");
        Bob.setName("Bob Walker");
        Bob.setAccumulatedCPA(3.21);
        Bob.setPreferCourse(new String[] {"Math", "Philosophy", "Art"});

        Student Trung = new Student();
        Trung.setId("TROY1217");
        Trung.setName("Bao Trung");
        Trung.setAccumulatedCPA(2.67);
        Trung.setPreferCourse(new String[] {"Computer Science I", "Math"});

        Student Nina = new Student();
        Nina.setId("TROY1362");
        Nina.setName("Nina Gigi");
        Nina.setAccumulatedCPA(2.99);
        Nina.setPreferCourse(new String[] {"Sing", "Dance", "Physics"});

        System.out.println(Bob.studentGetInfo());
        System.out.println(Trung.studentGetInfo());
        System.out.println(Nina.studentGetInfo());
    }
}