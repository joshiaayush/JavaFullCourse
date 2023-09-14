package practice.strings;

import java.util.Arrays;

public class SortingAlphabetically {
    public static void main(String[] args) {
        String str = "dcab";
        //Approach - 1
//        char temp;
//        char arr [] = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j < str.length(); j++) {
//                if(arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(new String(arr));
        //Input = dcab || Output = abcd


        //Approach - 2
//        char arr [] = str.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(new String(arr));
        //Input = dcab || Output = abcd
    }
}
