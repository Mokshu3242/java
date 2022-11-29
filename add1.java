import java.util.*;  
public class add1 
{  
public static void main(String args[])  
{  
int x, y, sum;  
Scanner s = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = s.nextInt();  
System.out.print("Enter the second number: ");  
y = s.nextInt();  
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
//method that calculates the sum  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}  
}  