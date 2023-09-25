package org.java;

// control statements are used to control the flow of the java code.
// java reads and compiles code from top to bottom, to make changes to this flow we use control.

// Decision making statements
    // if statements
    // switch statements
//Loop statements
    // do while loop
    // while loop
    // for loop
    // for each loop
//Jump Statements
    // break statement
    // continue statement
import java.util.Scanner;

public class ControlStatements {
   public static void main(String[] args){
       //ifExample(10,20);
       //sleepIn(true, false);
       //rangeHundred(210);
       //temperature(-1, 101);
       //nearestTo10(5,7);
       //switchStatement();
       //weekDay();
       //sum10();
       //print10();
       //tables(2);
       //triangle();
       //flag();
       //whileLoop();
       //countDown();
       //guessNumber();
       whileTables(2);
   }
    public static void ifExample(int a, int b){
        if(a+b > 20){
            System.out.println("a+b is greater than 20"); // execute if true
        } else {
            System.out.println("a+b is not greater than 20."); //execute if false
        }
    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation is true
    // if we are on vacation. We sleep in if it is not a weekday, or we're on vacation.

    public static void sleepIn(boolean weekday, boolean vacation){
       if(!weekday || vacation){
           System.out.println(true);
       } else {
           System.out.println(false);
       }
    }

    // Given an int, return true if it is within 10 of 100 or 200
    public static void rangeHundred(int n){
       if((n >= 90 && n <= 110) || (n >= 190 && n <= 210)){
          System.out.println("it's in range");
       } else {
           System.out.println("it's out of range");
       }
    }

    //Given 2 temperatures, return true if one is less than 0 and other is greater than 100.
    public static void temperature(int a, int b){
       if((a < 0 && b > 100) || (a > 100 && b < 0)){
          System.out.println(true);
       } else {
           System.out.println(false);
       }
    }

    // given 2 int values, return which ever value is nearest to 10if not then return 0 in event of tie
    public static void nearestTo10(int a, int b){
       int adiff = a-10;
       int bdiff = b-10;
       if(adiff > bdiff){
           System.out.println("A is nearer to 10");
       } else if (adiff < bdiff) {
           System.out.println("B is nearer to 10.");
       } else {
           System.out.println("0");
       }
    }

    // Switch statements
    // Switch (expression){
    // case 1:
    // statement 1;
    // break;
    //
        //case 2:;
        //statement 2;
        //break;
    //.
    //..
    //...
    //default
    //default statement;
    // }

    public static void switchStatement(){
       int num = 2;
       switch(num){
           case 0:
               System.out.println("This is number 0");
               break;
           case 1:
               System.out.println("This is number 1");
               break;
           case 2:
               System.out.println("This is number 2");
               break;
           default:
               System.out.println("This is a given number " + num);
       }


    }

    public static void weekDay(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a day number: ");
       int day = scanner.nextInt();
       switch(day){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Not a valid day of week");
       }
    }

    // Loop Statements
    // for (initialization,condition,increment/decrement)(block of statement)

    public static void sum10(){
       int sum = 0;
       for(int i = 1; i<=10; i++){
           sum = sum+i;
       }
       System.out.println("the sum of first 10 numbers is " + sum);
    }

    public static void print10(){
       for(int i = 1; i <= 10; i++){
           System.out.println(i + " ");
       }
    }

    // i can give any int i want you to print the multiplication table of that number.
    public static void tables(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
       for(int i = 1; i <= 10; i++){
           System.out.println(num + " * " + i + " = " + (num * i));
       }
    }

    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void flag(){
       int height = 5;
       int width = 20;
       int flagheight = height - 1;

       for(int row = 1; row <= flagheight; row++){
           for(int col = 1; col <= width; col++){
               if(col <= width / 2){
                   System.out.print("* ");
               } else {
                   System.out.print("= ");
               }
           }System.out.println();
       }
       //printing pole
        for(int i = 1; i <= height; i++){
            System.out.println("|");
        }

    }

    // While Loop
    public static void whileLoop(){
       int i = 1;
       while (i <= 10){
           System.out.println(i);
           i++;
       }
    }

    public static void countDown(){
       int countdown = 10;
       while(countdown >= 1){
           System.out.println("countdown " + countdown);
           countdown--;
       }
    }

    public static void guessNumber(){
       Scanner scanner = new Scanner(System.in);
       int secretNumber = 40;
       int guess;

       do{
           System.out.println("Guess the number: ");
           guess = scanner.nextInt();

           if (guess < secretNumber){
               System.out.println("try a higher number");
           } else if (guess > secretNumber){
               System.out.println("try a lower number");
           } else {
               System.out.println("GREAT!!! You got the number.. ");
           }
       } while
            (guess != secretNumber);
    }

    public static void whileTables(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = 1;
        num = scanner.nextInt();
        while( i <= 10){
            System.out.println(i + " * " + num + " = " + (num * i));
            i++;
        }
    }
}
