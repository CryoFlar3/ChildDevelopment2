package computermentors.org.childdevelopment.model;

import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by CryoFlar3 on 4/19/2015.
 */
public class Calculate {

    public Date Calculate(DatePicker dob, int early){

        Date newDate = new Date(dob.getYear() - 1900, dob.getMonth(), dob.getDayOfMonth());
        int noOfDays = early * 7;

        // Calculateing actual Birth
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(newDate);
        calendar.add(Calendar.DATE, noOfDays);
        newDate.setTime(calendar.getTime().getTime());

        return newDate;

    }

    public int getYear(Date date){

        Date now = new Date();

        // Parse Birth Date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

        // parse Current Date
        Calendar today = Calendar.getInstance();
        today.setTime(now);
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH);


        int ageYears = currentYear - year;
        if(currentMonth < month){
            ageYears--;
        }

        return ageYears;
    }

    public int getMonth(Date date){

        Date now = new Date();

        // Parse Birth Date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);

        // parse Current Date
        Calendar today = Calendar.getInstance();
        today.setTime(now);
        int currentMonth = today.get(Calendar.MONTH);


        int ageMonths = currentMonth - month;
        if (currentMonth < month){
            ageMonths--;
        }

        return ageMonths;
    }
}





























