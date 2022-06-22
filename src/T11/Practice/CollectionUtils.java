package T11.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionUtils {

    public static void countChars(String inputString){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void deleteDuplicates (String str){
        // Set to store unique characters in the given string
        HashSet<Character> s = new HashSet<Character>();
        // Loop to traverse the string
        for(int i = 0; i < str.length(); i++) {
            // Insert current character into the set
            s.add(str.charAt(i));
        }
        for (char c : s) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        countChars("AABBBACCB");
        deleteDuplicates("AABBBACCB");
    }
}
