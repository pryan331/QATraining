package testNG;
//testNG is a testing framework for Java that provides various annotations to control the behavior of test methods and classes. Here is a list of some of the commonly used annotations in TestNG.xml:
//        1. `@Test`: This annotation is used to mark a method as a test method. Test methods are the actual tests that you want to execute.
//        2. `@BeforeSuite`: This annotation is used to mark a method that should run before all the tests in a suite.
//        3. `@AfterSuite`: This annotation is used to mark a method that should run after all the tests in a suite.
//        4. `@BeforeTest`: This annotation is used to mark a method that should run before all the test methods in a test tag.
//        5. `@AfterTest`: This annotation is used to mark a method that should run after all the test methods in a test tag.
//        6. `@BeforeClass`: This annotation is used to mark a method that should run before all the test methods in a class.
//        7. `@AfterClass`: This annotation is used to mark a method that should run after all the test methods in a class.
//        8. `@BeforeMethod`: This annotation is used to mark a method that should run before each test method.
//        9. `@AfterMethod`: This annotation is used to mark a method that should run after each test method.
//        10. `@DataProvider`: This annotation is used to mark a method as a data provider for test methods. It supplies data for parameterized testing.
//        11. `@Parameters`: This annotation is used to specify parameters for a test method.
//        12. `@Factory`: This annotation is used to mark a method that returns an array of test class instances. It is used for creating instances of a test class for parallel execution.
//        13. `@Listeners`: This annotation is used to specify one or more listener classes for test execution.
//        14. `@Test(enabled = false)`: This annotation is used to disable a specific test method.
//        15. `@Test(dependsOnMethods = {"methodName"})`: This annotation is used to specify the dependency of a test method on another test method.
//        16. `@Test(priority = 1)`: This annotation is used to set the priority of test methods when running them.
//        17. `@Test(expectedExceptions = Exception.class)`: This annotation is used to specify the expected exception for a test method.
//        18. `@Test(timeOut = 5000)`: This annotation is used to set a timeout for a test method in milliseconds.
//        19. `@Test(threadPoolSize = 3)`: This annotation is used to specify the thread pool size for parallel execution of a test method.
//        These are some of the key annotations provided by TestNG.xml. You can use these annotations to control the execution flow, dependencies, parallelism, and behavior of your test methods and classes.

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Annotations {

    @Test
    public void testAdd() {
        int result = 3 + 3;
        assert result == 6;
        System.out.println("Test Passed");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void byZero() {
        int result = 10 / 0;
    }

    @Test
    public void testString() {
        String exc = "Hello World";
        String Act = "Hello World";

        Assert.assertEquals(exc, Act, "String Equality Failed");
    }

    @Test
    public void ArrayContent() {
        int[] numbs = {1, 2, 3, 4, 5};
        int TargetNumber = 3;
        boolean ContainsTarget = false;

        for (int num : numbs) {
            if (num == TargetNumber) {
                ContainsTarget = true;
                break;
            }
        }
        Assert.assertTrue(ContainsTarget, "Array does not have the target number.");
    }


//Homework

    // check if it's a leap year every 4 years - divisible by 4
    @Test
    public static void LeapYear() {
        int year = 2024;
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
        Assert.assertTrue(isLeapYear, "This is not a Leap Year.");
    }

    // check if it is a prime number or not -divisible by itself
    @Test
    public static void isPrimeNumber(){
        int num = 12;
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
        Assert.assertTrue(flag, "This is not a prime number.");
    }
    // check if it is an even number - divisible by 2
    // check if it is an odd number - not divisible by 2
    @Test
    public static void CheckNumber(){
        boolean isEvenNumber = false;
        // divisible by 2
        int x = 4;
        isEvenNumber = (x % 2 == 0);
        if (isEvenNumber){
            System.out.println("The number " + x + " is even.");
        } else {
            System.out.println("The number " + x + " is odd.");
        }
        Assert.assertTrue(isEvenNumber, "The number" + x +" is not even.");
    }
    //1. Write a program to check if a given number is even or odd.
    @Test
    public static void evenOdd(){
        int num = 6;
        boolean flag = false;
        if(num % 2 == 0){
            System.out.println("Number " + num + " is even.");
            flag = true;
        } else {
            System.out.println("Number " + num + " is odd.");
            flag = false;
        }
        Assert.assertTrue(flag, "Number is not even.");
    }
    //2. Create a program that prints the first 50 prime numbers.
    @Test
    public static void primeNumbers(){
        int n = 50;
        int status = 1;
        int num = 3;
        //For capturing the value of n
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the value of n:");
        //The entered value is stored in the var n
        //n = scanner.nextInt();
        if (n >= 1){
            System.out.println("First "+n+" prime numbers are:");
            //2 is a known prime number
            System.out.println(2);
        }

        for (int i = 2 ; i <= n; i++){
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
                if (num % j == 0 ){
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ){
                System.out.println(num);
                Assert.assertEquals(num,num++);
                i++;
            }
            status = 1;
            num++;
        }

    }
    //3. Implement a program to find the factorial of a given number using a loop.
    @Test
    public static void factorial(){
        int num = 10;
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
            System.out.println("This factorial is: "+fact);
            Assert.assertEquals(fact,fact++);
        }
    }
    //Math Methods
    // 1. Write a program to calculate the area and circumference of a circle given its radius.
    @Test
    public static void areaCircumference(){
        double radius = 3, area, circumference;
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter Radius of Circle:");
        //radius = in.nextDouble();
        // Calculate area and circumference of circle
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle : " + area);
        Assert.assertEquals(area,28.274333882308138);
        System.out.println("Circumference of Circle : " + circumference);
        Assert.assertEquals(circumference,18.84955592153876);
    }
    // 2. Implement a program that calculates the square root of a number using the
    // Math.sqrt() method.
    @Test
    public static void squareRoot(){
        int sqrRoot = 4;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the value of n:");
        //sqrRoot = scanner.nextInt();
        System.out.println("The square root of "+ sqrRoot +" is: " + Math.sqrt(sqrRoot));
        Assert.assertEquals(Math.sqrt(sqrRoot),2);
    }
    // 3. Create a program that generates and prints a random number between a given range.
    @Test
    public static void randomNum(){
        int min = 10;
        int max = 50;
        int randomNumber = (int) (Math.random() * max);
        boolean randNum = (randomNumber >= min) && (randomNumber <= max);
        if(randNum){
            System.out.println("Range is between " + min + " and " + max + " and random number is " + randomNumber);
            Assert.assertTrue(randNum);
        } else {
            System.out.println("Number " + randomNumber + " not in range.");
            Assert.assertFalse(randNum);
        }
    }
    // 4. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    @Test
    public static void greatestCD(){
        int num1 = 3;
        int num2 = 9;
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The Greatest Common Divisor of " + num2 + " is: " + gcd);
        Assert.assertEquals(gcd,3);
    }
    //String Methods
    // 1. Write a program that checks if a given string is a palindrome.
    @Test
    public static void palindrome(){
        String str = "RACECAR";
        String reverseString = "";
        boolean answer = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        if (str.equals(reverseString)) {
            answer = true;
        }
        System.out.println(str + " is a palindrome ");
        Assert.assertTrue(answer);
    }
    // 2. Create a program to count the occurrences of a specific word in a given sentence.
    @Test
    public static void wordCount(){
        String str = "The lazy goat jumped over the lazy stream.";
        String word = "lazy";
        String a[] = str.split(" ");

        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (word.equals(a[i]))
                count++;
        }
        System.out.println("The word("+word+") appears in the sentence " + count + " times.");
        Assert.assertEquals(count, 2);
    }
    // 3. Implement a program to reverse a given string without using built-in string reversal methods.
    @Test
    public static void reverseString(){
        String str = "alarm";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("The reverse string of 'alarm' is: "+reverse);
        Assert.assertEquals(reverse, "mrala");
    }
    // 4. Write a Java program to remove all duplicate characters from a string.
    @Test
    public static void removeDupChar(){
        String str = "alarm";
        String x = "a";
        String strNew = str.replace(x, "");
        System.out.println("Removing the duplicate characters ("+x+") from "+str+" results in: " + strNew);
        Assert.assertEquals(strNew, "lrm");
    }
    // 5. Create a program that capitalizes the first letter of each word in a sentence.
    @Test
    public static void capitalize(){
        String str = "capitalize each word in a sentence.";
        String a[] = str.split(" ");
        String newWord = "";
        String sentence = "";
        for (int i = 0; i < a.length; i++){
            newWord = a[i].substring(0,1).toUpperCase() + a[i].substring(1,a[i].length());
            System.out.print(newWord + " ");
            sentence += newWord + " ";
        }
        Assert.assertEquals(sentence.trim(),"Capitalize Each Word In A Sentence.");
    }
    // 1. Write a program to find the maximum and minimum values in an array of integers.
    @Test
    public static void maxMin(){
        int [] nums = {14,32,63,5,27};
        int max = nums[0];
        int min = nums[0];
        int len = nums.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            if (nums[i] > nums[i + 1]) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i + 1] < min) {
                    min = nums[i + 1];
                }
            }
            if (nums[i] < nums[i + 1]) {
                if (nums[i] < min) {
                    min = nums[i];
                }
                if (nums[i + 1] > max) {
                    max = nums[i + 1];
                }
            }
        }
        System.out.println(" Max value for the array = " + max);
        Assert.assertEquals(max,63);
        System.out.println(" Min value for the array = " + min);
        Assert.assertEquals(min, 5);
    }
    // 2. Implement a program to sort an array of integers.--{1,4,3,5,2}={1,2,3,4,5}
    @Test
    public static void getSortedArray(){
        int [] arr = {1,4,3,5,2};
        Arrays.sort(arr);
        String string = "";

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
            string += arr[i] + ",";
        }
        Assert.assertEquals(string,"1,2,3,4,5,");
    }
    // 3. Create a program that finds the second largest element in an array of integers.
    @Test
    public static void secondLargest(){
        int temp;
        int array[] = {12,22,25,59,88,45};

        for(int i = 0; i < array.length; i++ ){
            for(int j = i + 1; j < array.length; j++){

                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The second largest number is: " + array[array.length-2]);
        Assert.assertEquals(array[array.length-2],59);
    }
    // 4. Write a Java program to merge two sorted arrays into a single sorted array.
    @Test(priority = 1)//Runs test first 0 indexed 0 is default
    private static void mergeArrays() {
        int [] arrayA = {2,3,4,5,1};
        int [] arrayB = {7,8,9,10,6};
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i=0, j=0, k=0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
        Arrays.sort(arrayA);
        System.out.println("Array A : "+Arrays.toString(arrayA));
        Arrays.sort(arrayB);
        System.out.println("Array B : "+Arrays.toString(arrayB));
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        Assert.assertEquals(Arrays.toString(mergedArray),"[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", "Arrays do not match");
        System.out.println("Test 0 passed.");
    }
    // 5. Implement a program that removes all even numbers from an array of integers and returns a new array.
    @Test(enabled = false)//enabled = false will skip this test
    public static void oddArray(){
        int countOdd = 0;
        int newArray[] = null;

        int originalArray[] = {8, 7, 66, 14, 99, 20, 1, 42};

        for (int i : originalArray){
            if (!(i % 2 == 0))
                countOdd++;
        }

        newArray = new int[countOdd];

        int i = 0;
        for (int num : originalArray) {
            if (!(num % 2 == 0)) {
                newArray[i++] = num;
            }
        }
        System.out.println(Arrays.toString(newArray));
        Assert.assertEquals(Arrays.toString(newArray),"[7, 99, 1]");
    }

    @Test
    @Parameters({"param1", "param2"})
    public void  parameterizedTest(String param1, int param2){
        System.out.println("param 1: " + param1);
        System.out.println("param 2: "+ param2);
        Assert.assertEquals(param1,"Hello, World!");
        Assert.assertEquals(param2, 123);
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("This method will run before the test suite.");
    }

    @AfterSuite
    private void AfterSuite(){
        System.out.println("This method will run after the test suite is finished");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("This test will run before all the methods.");
    }

    @AfterMethod
    private void AfterMethod(){
        System.out.println("This test will run After All methods");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("This method will run before each class.");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("This method will run after each class.");
    }
    //-- ORDER OF TESTS --//
    //@BeforeSuite
    //@BeforeClass
    //@BeforeMethod
    //@Tests
    //@AfterMethod
    //@AfterClass
    //@AfterSuite
}

