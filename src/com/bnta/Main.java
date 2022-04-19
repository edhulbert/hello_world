package com.bnta;

import com.bnta.dates.Weekday;

public class Main {
    public static void main(String[] args) {
        // two forward slashes creates a comment.
        // System.out.println("Hello BNTA :)");
        /* This
        is a multi line comment

        // args = {"John", "Timmy", "Pete"}
        // enhanced for loop
        for (String arg : args) {
            System.out.println(arg);
        }
        */
        // a variable is a piece of information stored in memory, of a specific type
        // that can be retrieved/changed/removed
        String name = "John Doe";

        byte age = 3;           //1 byte, 8 bits. Range of -128 to 127
//        short numTwo = 3;       //2 bytes, 16 bits. Range of -32,768 to 32,767
//        int numThree = 3;       //4 bytes, 32 bits. Range of -2147483648 to 2147483647
//        long numFour = 3;       //8 bytes, 64 bits. Range of -9223372036854775808 to 9223372036854775807
        // in programming, we often need to preserve memory, make our program as efficient as possible

        System.out.println("You are " + name + " and you are " + age + " years old");

        char letter = 'r';

        char[] arr = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd',};
        CharacterWrapper chars = new CharacterWrapper(arr);
        char[] arr2 = {'y', 'o', 'u', 'r', ' ', 'n', 'a', 'n'};
        CharacterWrapper string2 = new CharacterWrapper(arr2);
        chars.printChars();
        string2.printChars();

        boolean itsSunny = true;

        if (itsSunny) {
            System.out.println("It is sunny!");
        } else {
            System.out.println("It is NOT sunny :(");
        }

        //a constant is a value that doesnt change once set
        final int num = 5;

        //enum
        Weekday day = Weekday.SATURDAY;

        if(day == Weekday.SUNDAY) {
            System.out.println("It is Sunday today!");
        } else if(day == Weekday.MONDAY){
            System.out.println("It is Monday today!");
        } else {
            System.out.println("It's somewhere between tuesday and saturday right now");
        }

        switch(day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("IT'S THE WEEKEND!!!");
                break;
        }


    }

}
