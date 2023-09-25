package CollectionsFramework;
//java hashset class is used to create a collection that uses hash table
//it inherits the abstractSet class and implements set interface.

//it stores elements by hashing
//it allows null value
//contains only unique elements
// non synchronized
//best for search
//capacity is 16 initial
//does not maintain insertion order.. it uses hashcode.

import java.util.HashMap;
import java.util.HashSet;

//list vs Set??
//a list can contain duplicate elements whereas set can only have unique.
public class AbouthashSet {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();

        nameSet.add("A");
        nameSet.add("Brian");
        nameSet.add("Patrick");
        nameSet.add("Kim");
        nameSet.add("B");

        nameSet.add("A");//Not unique, won't print
        nameSet.add("B");//Not unique, won't print

        System.out.println("Hash set has: " + nameSet);

        boolean containsKim = nameSet.contains("Kim");
        System.out.println(containsKim);

        boolean removed = nameSet.remove("B");
        System.out.println("Removed : " + removed);
        System.out.println(nameSet);
        System.out.println(nameSet.size());
        nameSet.clear();
        System.out.println(nameSet);
        int[] nums = {2, 5, 3, 2, 4, 3, 4};
        int result = challenge.findFirstNonRepeating(nums);
        System.out.println(result);

    }
}
//Challenge: Find the first non-repeated element in an array.
//        Description: Given an array of integers, find the first non-repeated element.
//        If there are no non-repeated elements, return -1.
//        Example:
//        Input: [2, 5, 3, 2, 4, 3, 4]
//        Output: 5
class challenge{
    public static int findFirstNonRepeating(int[] nums){

        HashMap<Integer, Integer> countMap = new HashMap<>();

        HashSet<Integer> nonRepeatSet = new HashSet<>();

        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);

            if (countMap.get(num)==1){
                nonRepeatSet.add(num);
            }else {
                nonRepeatSet.remove(num);
            }
        }
        for (int num : nums){
            if (nonRepeatSet.contains(num)){
                return num;
            }
        }
        return -1;
    }
}


