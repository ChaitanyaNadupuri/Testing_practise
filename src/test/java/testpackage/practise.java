package testpackage;

import org.testng.annotations.Test;

import java.util.*;

public class practise {


    public static void main(String[] a) {

        int[] num = {1, 3, 4, 5};
        int[] num1 = {4, 5, 7, 8};
        List<String> list2 = new ArrayList<>();

        for (int i : num) {
            for (int j : num1) {
                list2.add("(" + i + "," + j + ")");
            }

        }
        System.out.println(list2);
        System.out.println("count is" + " " + list2.size());
    }

    @Test
    public void pattern() {
//        for (int i=5;i>0;i--){
//
//            for(int j=i;j<6;j++){
//                System.out.print("*");
//            }
//               System.out.println();
//        }

        for (int i = 1; i <= 6; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


    @Test
    public void list() {

        List<Integer> l1 = new ArrayList<>();
        l1.add(6);

    }


//finding duplicate words
    @Test
    public void duplicateWords() {
      String s1 = "chaitu welcomes chaitu with welcomes to welcomes";
      String[] s2 =s1.split(" ");
        System.out.println(Arrays.toString(s2));
//        for (String s3: s2){
//            int count = 0;
//            for(String s4 : s2){
//                if(s3.equals(s4)){
//                    count++;
//                }
//
//            }
//            System.out.println("count of string "+s3+" is "+count);
//        }
        Set<String> s4 = new HashSet<>();
        s4.addAll(Arrays.asList(s2));
        System.out.println(s4);
    }
}