package practice.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AayushJoshi";

        //Approach - 1
//        StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(c -> sb.append((char)c));
//        System.out.println(sb);
        //Input = AayushJoshi || Output = AayushJoi


        // Approach -2
//        StringBuilder sb1 = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int indx = str.indexOf(ch,i+1);
//            if(indx == -1){
//                sb1.append(ch);
//            }
//        }
//        System.out.println(sb1);
        //input = AayushJoshi and output is = AayuJoshi

        //Approach - 3
//        char[] arr = str.toCharArray();
//        StringBuilder sb3 = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = false;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    flag = true;
//                    break;
//                }
//
//            }
//            if (!flag) {
//                sb3.append(arr[i]);
//            }
//        }
//        System.out.println(sb3);
        //input = AayushJoshi and output is = AayuJoshi


        //Approach - 4
//        StringBuilder sb4 = new StringBuilder();
//        Set<Character> set = new LinkedHashSet();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//        for (Character c: set) {
//            sb4.append(c);
//        }
//        System.out.println(sb4);
        //Input = AayushJoshi || Output = AayushJoi

    }
}