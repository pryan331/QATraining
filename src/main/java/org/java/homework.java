package org.java;

public class homework {
    public static void main(String[] args) {
        LeapYear(2023);
        PrimeNumber(29);
        CheckNumber(24);
        CheckNumber(25);
    }
    // check if it's a leap year every 4 years - divisible by 4
    public static void LeapYear(int x){
        int year = x;
        boolean isLeapYear;

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4, not by 100, or divisible by 400
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    // check if it is a prime number or not -divisible by itself
    public static void PrimeNumber(int x){
        int num = x;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    // check if it is an even number - divisible by 2
    // check if it is an odd number - not divisible by 2
    public static void CheckNumber(int x){
        boolean isEvenNumber = false;
        // divisible by 2
        isEvenNumber = (x % 2 == 0);
        if (isEvenNumber){
            System.out.println("The number " + x + " is even.");
        } else {
            System.out.println("The number " + x + " is odd.");
        }
    }
}
