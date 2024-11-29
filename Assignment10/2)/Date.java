public class Date {
    private int day;
    private int month;
    private int year;

    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }

   
    public String toString() {
        return day + "/" + month + "/" + year;
    }

   
    public boolean isValid() {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

       
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
                return day <= 29;
            }
            return day <= 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        return true;
    }
}
