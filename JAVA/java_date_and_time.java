import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to s=a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
     
    private int month,day,year;

    public static String findDay(int month, int day, int year) {
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR,year);
        c1.set(Calendar.MONTH,month-1);
        c1.set(Calendar.DATE,day);
        int a = c1.get(Calendar.DAY_OF_WEEK);
        String s="";
        if(a==1){
            s="SUNDAY";
        }else if(a==2){
            s="MONDAY";
        }else if(a==3){
            s="TUESDAY";
        }else if(a==4){
            s="WEDNESDAY";
        }else if(a==5){
            s="THURSDAY";
        }else if(a==6){
            s="FRIDAY";
        }else if(a==7){
            s="SATURDAY";
        }
        return s;
    }
}

public class Solution {
