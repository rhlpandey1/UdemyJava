package techChefsHackerRankTest;

import java.util.*;

public class CompareFbFriends {

        public static List<String> compareFriends(List<String> frndsList) {
            Collections.sort(frndsList);
            System.out.println(frndsList);
            List<String> treeSet = new ArrayList<>();
            for(String s : frndsList){
                String[] strArray = s.split(",");
                List<String> list = Arrays.asList(strArray);
                Collections.swap(list, 0, 1);
                String s2 = list.get(0) + "," + list.get(1);
                if(!treeSet.contains(s) && !treeSet.contains(s2)){
                    treeSet.add(s);
                }
            }

            List<String> output = new ArrayList<>(treeSet);
            return output;
    }

    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("U1,U2");
        list1.add("U3,U4");
        list1.add("U2,U1");
        list1.add("U1,U5");
        List<String> op=compareFriends(list1);
        for(String str:op)
        {
            System.out.println(str);
        }

    }
}
