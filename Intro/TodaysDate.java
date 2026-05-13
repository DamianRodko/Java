package Words;
import java.util.Scanner;
import java.util.Date;
public class TodaysDate
{
	public static void main(String []args)
	{
        //Todays Date
        Scanner in = new Scanner(System.in);
        Date currentDate = new Date();
        System.out.println(currentDate);
        int getYear = currentDate.getYear() + 1900;
        int getMonth = currentDate.getMonth() - 1;
        int getDate = currentDate.getDate();
        int getDay = currentDate.getDay();
        String getDaySwitch = "";
        switch(getDay)
        {
            case 0:
                getDaySwitch = "Sunday";
                break;
            case 1:
                getDaySwitch = "Monday";
                break;
            case 2:
                getDaySwitch = "Tuesday";
                break;
            case 3:
                getDaySwitch = "Wednesday";
                break;
            case 4:
                getDaySwitch = "Thursday";
                
            case 5:
                getDaySwitch = "Friday";
                break;
            case 6:
                getDaySwitch = "Saturday";
                break;
        }
        String getMonthSwitch = "";
        switch(getMonth)
        {
            case 0:
                getMonthSwitch = "January";
                break;
            case 1:
                getMonthSwitch = "February";
                break;
            case 2:
                getMonthSwitch = "March";
                break;
            case 3:
                getMonthSwitch = "April";
                break;
            case 4:
                getMonthSwitch = "May";
                break;
            case 5:
                getMonthSwitch = "June";
                break;
            case 6:
                getMonthSwitch = "July";
                break;
            case 7:
                getMonthSwitch = "August";
                break;
            case 8:
                getMonthSwitch = "September";
                break;
            case 9:
                getMonthSwitch = "October";
                break;
            case 10:
                getMonthSwitch = "November";
                break;
            case 11:
                getMonthSwitch = "December";
                break;
        }
        System.out.println("Today's date is: " + (getMonth) + "/" + getDate + "/" + (getYear) + ".");
        System.out.println(getDaySwitch + ", " + getMonthSwitch + " " + getDate + ", " + getYear);
        }
}