package testpackage;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Test1 extends ParentTest {
    ObjectClass obj = new ObjectClass();

    @Test

    public void student() {
        boolean flag = true;
        long num = 10000000000000L;
        float f = 1.2323232323232323232f;
        System.out.printf("float is %.19f", f);
        String[] fruit = {"mango", "banana", "apple", "guava", "grapes"};
        for (String i : fruit) {
            System.out.println(i);
            if (i.equals("apple")) {
                System.out.println("my fav fruit is apple");
                break;
            }

        }

    }

    @Test
    public void nameExt() {
        Name = Name + "\"chowdhary\"";
        System.out.println(Name);
        obj.show();
    }

    @Test
    public void reverseArray() {
        int[] arr = {34, 2343, 45, 67, 3489, 98, 34891, 456, 3412};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int j = arr.length - i - 1;
            newarr[j] = value;
        }
        System.out.println(Arrays.toString(newarr));

    }





}



