public class TestDate {
    
   
    public static Date getNextDay(Date d) {
        int day = d.getDay();
        int month = d.getMonth();
        int year = d.getYear();
        
       
        day++;
        
        Date temp = new Date(day, month, year);
        
       
        if (!temp.isValid()) {
            day = 1;
            month++;
            temp.setDay(day);
            temp.setMonth(month);
            
            
            if (!temp.isValid()) {
                month = 1;
                year++;
                temp.setMonth(month);
                temp.setYear(year);
            }
        }
        return temp;
    }
    
   
    public static Date getPreviousDay(Date d) {
        int day = d.getDay();
        int month = d.getMonth();
        int year = d.getYear();
        
        
        day--;
        
        Date temp = new Date(day, month, year);
        
       
        if (!temp.isValid()) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            
           
            temp.setMonth(month);
            temp.setYear(year);
            if (month == 2) {
                temp.setDay((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                temp.setDay(30);
            } else {
                temp.setDay(31);
            }
        }
        return temp;
    }
    
    
    public static Date getDateAfterOneYear(Date d) {
        int day = d.getDay();
        int month = d.getMonth();
        int year = d.getYear();
        
        year++; 
        Date temp = new Date(day, month, year);
        
       
        if (!temp.isValid()) {
          
            if (month == 2 && day == 29 && !(year % 4 == 0 && year % 100 != 0) && !(year % 400 == 0)) {
               
                temp.setDay(28);
            }
        }
        return temp;
    }
    
    public static void main(String[] args) {
      
        Date date1 = new Date(1, 1, 2012);   
        Date date2 = new Date(31, 1, 2012);  
        Date date3 = new Date(31, 12, 2012); 
        
        
        System.out.println("Current Date: " + date1.toString() + " | Next Day: " + getNextDay(date1).toString());
        System.out.println("Current Date: " + date2.toString() + " | Next Day: " + getNextDay(date2).toString());
        System.out.println("Current Date: " + date3.toString() + " | Next Day: " + getNextDay(date3).toString());
        
        
        Date prevDay = getPreviousDay(date1);
        System.out.println("Previous Day of 1/1/2012: " + prevDay.toString());
        
       
        Date leapYearDate = new Date(29, 2, 2012);
        Date nextYearDate = getDateAfterOneYear(leapYearDate);
        System.out.println("One year after 29/2/2012: " + nextYearDate.toString());
    }
}
