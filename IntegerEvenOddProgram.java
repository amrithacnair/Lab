import java.util.Scanner;
class IntegerEvenOddProgram
{
 public static void main(String[] args)
{
 int i;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
 i=sc.nextInt();
  if(i%2==0)
  { 
  System.out.println("The Number .."+i+" is Even");
  }
else
System.out.println("The number....."+i+" is Odd ");
}
}
 