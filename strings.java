// Java program to ReverseString using StringBuilder
// import java.lang.*;
// import java.io.*;
// import java.util.*;
  
// Class of ReverseString
class ReverseString {
    public static void main(String[] args)
    {
        String input = "Geeks for Geeks";
  
        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(input);
  
        // reverse StringBuilder input1
        input1.reverse();
  
        // print reversed String
        System.out.println(input1);
    }
}


class ConditionalDemo2 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = false;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}


class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
}