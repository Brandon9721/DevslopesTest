
package practice;

// TimeConverter.java
// Brandon Byrne (20115464) June 5, 2016

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TimeConverter
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
       
        String unit1;
        String unit2;
        
       for (int i = 0; i < 3; i++)
       {
            unit1 = JOptionPane.showInputDialog("What unit of time would you like to convert?\nSeconds, minutes,"
                    + " hours, days, weeks, or years:");

            String amount = JOptionPane.showInputDialog("How many " + unit1 + " do you want to convert");
            double timeAmount = Double.parseDouble(amount);
           
            unit2 = JOptionPane.showInputDialog("What unit do you wish to convert " + unit1 + " to?");

            JOptionPane.showMessageDialog(null, "There are " + answer(timeAmount, unit1, unit2) + " " + unit2 + " in " + timeAmount + " " + unit1);

       }
    }

    private static double answer(double timeAmount, String unit1, String unit2 ) 
    {
        double answer = 0;
        if (unit1.equalsIgnoreCase("seconds"))
            answer = secondsConv(timeAmount, unit1, unit2);
       
        else if (unit1.equalsIgnoreCase("minutes"))
            answer = minutesConv(timeAmount, unit1, unit2);
        
        else if (unit1.equalsIgnoreCase("hours"))
            answer = hoursConv(timeAmount, unit1, unit2);
        
        else if (unit1.equalsIgnoreCase("days"))
            answer = daysConv(timeAmount, unit1, unit2);
        
        else if (unit1.equalsIgnoreCase("weeks"))
            answer = weeksConv(timeAmount, unit1, unit2);
        
        else if (unit1.equalsIgnoreCase("years"))
            answer = yearsConv(timeAmount, unit1, unit2);
        
        return answer;
    }
    
    private static double secondsConv(double timeAmount, String unit1, String unit2)
    {
        
        double answer = 0.0;
        if (unit2.equalsIgnoreCase("minutes"))
            answer = timeAmount / 60;
        
        else if (unit2.equalsIgnoreCase("hours"))
            answer = timeAmount / 3600;
       
        else if (unit2.equalsIgnoreCase("days"))
            answer = timeAmount / 86400;
        
         else if (unit2.equalsIgnoreCase("weeks"))
            answer = timeAmount / 604800;
        
         else if (unit2.equalsIgnoreCase("years"))
            answer = timeAmount / 31536000;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;
    }

    private static double minutesConv(double timeAmount, String unit1, String unit2) 
    {
       double answer = 0.0;
        if (unit2.equalsIgnoreCase("seconds"))
            answer = timeAmount * 60;
        
        else if (unit2.equalsIgnoreCase("hours"))
            answer = timeAmount / 60;
       
        else if (unit2.equalsIgnoreCase("days"))
            answer = timeAmount / 1440;
        
         else if (unit2.equalsIgnoreCase("weeks"))
            answer = timeAmount / 10080;
        
         else if (unit2.equalsIgnoreCase("years"))
            answer = timeAmount / 31536000;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;
    }

    private static double hoursConv(double timeAmount, String unit1, String unit2) 
    {
        double answer = 0.0;
        if (unit2.equalsIgnoreCase("seconds"))
            answer = timeAmount * 3600;
        
        else if (unit2.equalsIgnoreCase("minutes"))
            answer = timeAmount * 60;
       
        else if (unit2.equalsIgnoreCase("days"))
            answer = timeAmount / 24;
        
         else if (unit2.equalsIgnoreCase("weeks"))
            answer = timeAmount / 168;
        
         else if (unit2.equalsIgnoreCase("years"))
            answer = timeAmount / 8760;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;
    }

    private static double daysConv(double timeAmount, String unit1, String unit2) 
    {
        double answer = 0.0;
        if (unit2.equalsIgnoreCase("seconds"))
            answer = timeAmount * 86400;
        
        else if (unit2.equalsIgnoreCase("minutes"))
            answer = timeAmount * 1440;
       
        else if (unit2.equalsIgnoreCase("hours"))
            answer = timeAmount * 24;
        
         else if (unit2.equalsIgnoreCase("weeks"))
            answer = timeAmount / 7;
        
         else if (unit2.equalsIgnoreCase("years"))
            answer = timeAmount / 365;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;
    }

    private static double weeksConv(double timeAmount, String unit1, String unit2)
    {
        double answer = 0.0;
        if (unit2.equalsIgnoreCase("seconds"))
            answer = timeAmount * 604800;
        
        else if (unit2.equalsIgnoreCase("minutes"))
            answer = timeAmount * 10080;
       
        else if (unit2.equalsIgnoreCase("hours"))
            answer = timeAmount * 168;
        
         else if (unit2.equalsIgnoreCase("days"))
            answer = timeAmount * 7;
        
         else if (unit2.equalsIgnoreCase("years"))
            answer = timeAmount / 52.14285714285714;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;
    }

    private static double yearsConv(double timeAmount, String unit1, String unit2) 
    {
 double answer = 0.0;
        if (unit2.equalsIgnoreCase("seconds"))
            answer = timeAmount * 31536000;
        
        else if (unit2.equalsIgnoreCase("minutes"))
            answer = timeAmount * 525600;
       
        else if (unit2.equalsIgnoreCase("hours"))
            answer = timeAmount * 8760;
        
         else if (unit2.equalsIgnoreCase("days"))
            answer = timeAmount * 365;
        
         else if (unit2.equalsIgnoreCase("weeks"))
            answer = timeAmount * 52.14285714285714;
         else
             JOptionPane.showMessageDialog(null, "There was an error in your spelling");
        
        return answer;

    }

   
    
    
    
}