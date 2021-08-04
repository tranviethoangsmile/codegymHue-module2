package com.codegymhueJava;

public class FizzBuzz {

    public static String fizzBuzz(int index) {
        String displayFizzBuzz = "";
        if(index < 0){
            System.out.println("please enter number > 0");
        }else{
            if (index % 3 == 0 && index % 5 == 0 )
            {
                displayFizzBuzz = "FizzBuzz";
            }else if(index % 3 == 0){
                displayFizzBuzz = "Fizz";
            }else if(index % 5 == 0) {
                displayFizzBuzz = "Buzz";
            }
        }
        return displayFizzBuzz;
    }
}
