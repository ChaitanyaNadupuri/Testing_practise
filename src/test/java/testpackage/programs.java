package testpackage;

import org.testng.annotations.Test;

public class programs {
   @Test
    public void palindrome(){
        String str = "malayalam";
        boolean flag = true;
        char[] ch1 =str.toCharArray();
        for (int i=0;i<ch1.length;i++){
           char k = ch1[i];
           int index = ch1.length-i- 1;
           if (ch1[index] != k){
               flag = false;

           }
        }
        if (flag){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its is not a palindrome");
        }
    }
@Test
    public  void polindromes(){
       String name = "chaitu";
       int left = 0;
       int right = name.length()-1;
       boolean flag =true;
       while (left <right) {
           if (name.charAt(left) != name.charAt(right)) {
               flag = false;
           }
           left++;
           right--;
       }
        if (flag){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its is not a palindrome");
        }
   }

@Test
   public void reverseString(){
       String input = "Greeshma";
       char[] ch1 = input.toCharArray();
       int first = 0;
       int last = ch1.length-1;
       while (first<last){
//           creating a variable to store first index we can we can use it later
           char  ch =ch1[first];
           ch1[first]=ch1[last];
           ch1[last]=ch;
           first++;
           last--;

       }
       System.out.println(ch1);
   }

   @Test
   public void swapNumbers(){
       int a=10;
       int b=20;
       int temp;
       temp=a;
       a=b;
       b=temp;
       System.out.println("value of a"+a);
       System.out.println("value of b"+b);


   }
 @Test
   public void armstrongNumber(){
       int num = 153;
       int temp = num ;
       int rem;
       int sum=0;
       while (num>0){
           rem = num % 10;
           num = num/10;
           sum = sum +(rem*rem*rem);

       }

       if(temp == sum) {
           System.out.println("its an armstrong number");
       }
       else
       {
               System.out.println("not an armstrong number");
           }
       }


       @Test
       public void primeNumber(){
       
       }
   }














