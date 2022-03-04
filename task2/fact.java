import java.util.*;

class Factorial{  
 public static void main(String args[]){  
  int i,fact=1; 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Number:");
  int no=sc.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=no;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+no+" is: "+fact);    
 }  
} 