import java.util.*;
class MultiplyTwoFloatNumbers
{
 public static void main(String[] args)
 {
  float a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter The First Number....:");
  a=sc.nextFloat();
 System.out.println("Enter The Second Number....:");
 b=sc.nextFloat();
 c=a*b;
 System.out.println("The Multiplication of..."+a+"  and  "+b+"  is  "+c);
}
}