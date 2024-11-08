public class payRoll{
    private String employeeName;
    private String id;
    private double hourlyRate = 0.0;
    private int hourWorked = 0;

    payRoll(String employeeName, String id){
        this.employeeName = employeeName;
        this.id = id;
    }
    public String getName(){
        return employeeName;
    }
    public String getId(){
        return id;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public int getHourWorked(){
        return hourWorked;
    }
    public double getGrossPay(){
        return hourlyRate * hourWorked;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setHourlyRate(double hourlyRate){
        if(hourlyRate > 0){
            this.hourlyRate = hourlyRate;
        }
    }
    public void setHourWorked(int hourWorked){
        if(hourWorked > 0){
            this.hourWorked = hourWorked;
        }
    }

}