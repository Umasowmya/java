import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {
    Date signUpDate, currentDate,startDate,endDate;
    String StartDate, EndDate;
    public void Kyc(String iSignUpDate, String iCurrentDate) {
        try {
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = formatter.parse(iSignUpDate);
            currentDate= formatter.parse(iCurrentDate);
            if(signUpDate.after(currentDate)) {
                System.out.println("No range");
            }
            else {
                startDate = signUpDate;
                
                startDate.setYear(currentDate.getYear());
              
                Calendar calendar = Calendar.getInstance();
               
                calendar.setTime(startDate);
               
                calendar.add(Calendar.DATE, -30);
                startDate=calendar.getTime();
               
                calendar.add(Calendar.DATE, 60);
                endDate=calendar.getTime();
                
                if(endDate.after(currentDate)) {
                    endDate=currentDate;
                }
            }
            
            StartDate=formatter.format(startDate);
            EndDate=formatter.format(endDate);
            System.out.println(StartDate+"    "+EndDate );
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }


}
    public static void main(String[] args) {
        
        Main obj =new Main();
        
        obj.Kyc("16-07-1998", "27-06-2017");
        obj.Kyc("04-02-2016", "04-04-2017");
        obj.Kyc("04-05-2017", "04-04-2017");
        obj.Kyc("04-04-2015", "04-04-2016");
        obj.Kyc("04-04-2015", "15-03-2016");

    }
}
