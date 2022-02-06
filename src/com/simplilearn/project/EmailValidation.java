package com.simplilearn.project;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String[]args){  
       
    	ArrayList<String> emails = new ArrayList<String>();  
        emails.add("lkmjut@domain.co.in");  
        emails.add("oijuyh@domain.com");  
        emails.add("kjuyg.name@domain.com");  
        emails.add("loith#@domain.co.in");  
        emails.add("gfhf@domain.com");  
        emails.add("abv@domaincom"); 
        
        //Adding invalid emails in list  
        emails.add("lko@yahoo.com");  
        emails.add("mnqwrt#domain.com"); 
        
        //Regular Expression   
         String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
