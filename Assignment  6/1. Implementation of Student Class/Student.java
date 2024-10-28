import java.util.Arrays;

public class Student {
    private String id;
    private String name;
    private double accumulatedCPA;
    private String[] preferCourse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccumulatedCPA() {
        return accumulatedCPA;
    }

    public void setAccumulatedCPA(double accumulatedCPA) {
        this.accumulatedCPA = accumulatedCPA;
    }

    public String[] getPreferCourse() {
        return preferCourse;
    }

    public void setPreferCourse(String[] preferCourse) {
        this.preferCourse = preferCourse;
    }

    public String studentGetInfo(){
        return this.getId() + " | Student name: " + this.getName() + " | Accumulated CPA:  " + this.getAccumulatedCPA() + " | Student prefer course: " + Arrays.toString(this.getPreferCourse());
    }
}
