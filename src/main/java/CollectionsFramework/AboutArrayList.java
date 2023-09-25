package CollectionsFramework;
//What is Collections Framework??
//The collections framework in java is architecture to store and  maintain
//the group of objects

//java collections can achieve all operations on data that were listed in java arrays..
//java collections means a single unit of objects.
//it has interfaces like SET LIST QUE DEQUE..
//It has classes like ARRAYLIST, LINKEDLIST, HASHSet, LINKEDHASHSET, TREESET

//Hirarchy of Collection Framework

//Iterable
//Collection
// LIST     //QUEUE      // SET
//LIST ->> ARRAYLIST , LINKEDLIST, VECTOR STACK
//QUEUE ->> PRIORITYQUEUE, DEQUEUE, ARRAYDEQUE
//SET ->> HASHSET, LINKEDHASHSET, SORTEDSET, TREESET

//Interfaces Like --> Iterable, Iterator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class AboutArrayList {
    public static void main(String[] args) {

        //Arraylist();
        //ExtractInt();
        //System.out.println();
        ExtractEvenStrings();
        ExtractInts();


    }

    public static void Arraylist() {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : arr) {
            arrayList.add(num);
        }

        arrayList.add(6);

        Collections.sort(arrayList, Comparator.reverseOrder());

        System.out.println("This Array has: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }


//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        System.out.println("Element at index 0: " + numbers.get(0));
//        System.out.println("Element at index 1: " + numbers.get(1));
//        numbers.set(1,20);
//        numbers.remove(2);
//
//        System.out.println(numbers.size());
//        for(Integer number : numbers){
//            System.out.print(number + " ");
//        }
    }

public static void ExtractInt(){
    String[] str = {"1","two","3","four","5","six","7","eight","9","ten"};
    //print all int in to an array.
    //print all strings into a string array
    //ArrayList
    //Integer.parseInt()

    ArrayList<Integer> integers = new ArrayList<>();

    for (String s : str){
        try {
            int num = parseInt(s);
            integers.add(num);
        }catch (NumberFormatException e){
            e.getMessage();
        }
    }

    int[] intArray = new int[integers.size()];
    for (int i = 0;i < integers.size();i++){
        intArray[i] = integers.get(i);
    }

    for (int num : intArray){
        System.out.print(num+ " ");
    }
}
//print all int in to an array.
//print all strings into a string array
//ArrayList
//Integer.parseInt()
public static void ExtractEvenStrings(){
    String[] strArray = {"1","two","3","four","5","six","7","eight","9","ten","11","twelve"};
    ArrayList<String> al = new ArrayList<>();

    for(int i = 0; i < strArray.length; i++){
        try {
            if((Integer.parseInt(strArray[i]) % 2 != 0));
            else continue;
        } catch (NumberFormatException e){
            e.getMessage();
            al.add(strArray[i]);
        }
    }

    Object[] objects = al.toArray();

    // Printing array of objects
    for (Object obj : objects)
        System.out.print(obj + " ");
    }

    public static void ExtractInts(){
        String[] str = {"1","two","3","four","5","six","7","eight","9","ten"};
        //print all int in to an array.
        //print all strings into a string array.
        //ArrayList
        //Integer.parseInt()

        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        for (String s : str) {
            try {
                int num = Integer.parseInt(s);
                intList.add(num);
            } catch (NumberFormatException ignored) {
                stringList.add(s);
            }
        }

        // Convert ArrayLists to arrays
        int[] intArray = intList.stream().mapToInt(Integer::intValue).toArray();
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the extracted integers
        System.out.println("Integers:");
        for (int num : intArray) {
            System.out.print(num + " | ");
        }

        // Print the extracted strings
        System.out.println("Strings:");
        for (String s : stringArray) {
            System.out.print(s + " | ");
        }
    }
}



