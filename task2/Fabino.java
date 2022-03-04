import java.io.*;
import java.util.*;

class Fibonacci
{  
public static void main(String args[])  
{    

 //printing 0 and 1
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the first Number:: "); 
 int n1=sc.nextInt();
 System.out.print("Enter the second Number:: "); 
 int n2=sc.nextInt();
 int n3;
 System.out.print("Enter the  Number  for fabonacci series :: "); 
 int count=sc.nextInt();

 for( int i=0;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    

}}