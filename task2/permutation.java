import java.util.*;   
public class Permutition {  
   static int fact(int number) {  
      int f = 1;  
      int j = 1;  
      while(j <= number) {  
         f = f * j;  
         j++;  
      }  
      return f;  
   }  
   public static void main(String args[]) {  

      List<Integer> numbers = new ArrayList<Integer>();  

      numbers.add(4);  
      numbers.add(3);  
      numbers.add(2);  
      numbers.add(2);  
      numbers.add(2);
      numbers.add(2);

      int n = numbers.size();  
      int r = 3;  
      int result;  

      result = fact(n) / fact(n-r);  
      System.out.println("The permutation value for the numbers list is: " + result);  
   }  
} 