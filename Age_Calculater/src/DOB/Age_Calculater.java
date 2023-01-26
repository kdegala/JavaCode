package DOB;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class Age_Calculater
{
    public static void main(String[] args)
    {
        System.out.println("Enter date of birth in YYYY-MM-DD format");
        Scanner scan= new Scanner(System.in);// Capture entered date
        String Date= scan.nextLine();
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat(Date);
        LocalDate bithdate= LocalDate.parse(Date);
        LocalDate today= LocalDate.now();// get current date
        int Years= Period.between(bithdate,today).getYears(); //Calculate  the difference between dates and get years
        int Months= Period.between(bithdate,today).getMonths(); //Calculate  the difference between dates and get months
        int Days= Period.between(bithdate,today).getDays();//Calculate the difference between dates and get Days
        System.out.println(Years+"Years "+Months+"Months "+Days+"Days ");
    }
}
