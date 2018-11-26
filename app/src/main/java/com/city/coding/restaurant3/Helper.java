package com.city.coding.restaurant3;

public class Helper {
    //static section
    //male
    private static final int MALE = 1 ;
    //female
    private static final int FEMALE = 2;
    //Other
    private static final int OTHER = 3;
    //end


    // check the gender of the client
    public static String myGender(int gender)
    {
        //check gender male=1 , female=2 , other=3
       if(gender == MALE)
           return "Male";
       else if (gender == FEMALE)
           return "Female";
       else
           return "Other";
    }
    //end myGender

    //method to capitalize the first Letter in a text
    public static String firstLetterCap(String str)
    {
        //first remove edge space using trim() fun
        //and then split all the text using split() fun
        String strArr [] = str.trim().split(" ");
        //create string builder object
        StringBuilder output = new StringBuilder();
        //loop through strArr and capital the first letter
        //append in each loop until exiting
        for(int i = 0 ; i<strArr.length ;i++)
        {   //sub the element and capitalize it
            String ele = strArr[i].substring(0,1).toUpperCase();
            //append it to stringBuilder with the rest of the String
            output.append(ele+strArr[i].substring(1));
            //add space
            output.append(" ");
        }
        //return the output as string
       return output.toString();
    }
}
