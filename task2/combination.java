import java.util.*;   
class Combination {  
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

      numbers.add(6);  
      numbers.add(12);  
      numbers.add(1);  
      numbers.add(6);  
      numbers.add(9);


      int n = numbers.size();  
      int r = 3;  
      int result;  

      result = fact(n) / (fact(r) * fact(n-r));  
      System.out.println("The combination value for the numbers list is: " + result);  
   }  
}   