import java.util.*;
class CalculatorProgram
{
 public static void main(String[] args)
{
 int a,b,ch,c;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the First Number:");
 a=sc.nextInt();
 System.out.println("Enter the Second Number:");
 b=sc.nextInt();
 System.out.println("Enter the Choice");
 ch=sc.nextInt();
 switch(ch)
{
  case 1:System.out.println("Addition Result is"+(a+b));
          break;
  case 2:System.out.println("Subtraction Result is"+(a-b));
          break;
  case 3:System.out.println("Multiplication Result is"+(a*b));
          break;
  case 4:System.out.println("Division Result is"+(a/b));
          break;
  default:System.out.println("Invalid Result");
          break;
}
}
}
 
 
 
 