package techChefsHackerRankTest;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatePairs {
    public String removeCharacters(String input, String mask){
        // Add mask characters in to set.
        Set<Character> maskSet = new HashSet<>();
        for(char c: mask.toCharArray()){
            // Hashset add O(1)
            maskSet.add(c);
        }
        // Loop through input characters and check if it's presnt in mask set.
        //List<Character> output = new ArrayList<>();
        String op1 = "";
        for (int i = 0; i < input.length(); i++) {
            // HashSet look up O(1)
            if(!maskSet.contains(input.charAt(i))){
                // List add O(1)
                //output.add(input.charAt(i));
                op1= op1 + input.charAt(i);
            }

        }
        // return String.valueOf(output);
        return op1;
    }
    public static void main(String[] args) {
        System.out.printf("Output - %s", new RemoveDuplicatePairs().removeCharacters("BBANGALORE", "AN"));
    }

}
