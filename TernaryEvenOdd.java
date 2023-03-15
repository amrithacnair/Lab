import java.util.*;
class TernaryEvenOdd
{
 public static void main(String[] args)
{
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Number:");
 n=sc.nextInt();
 String e=(n%2==0)?"The Number is Even":"The Number is Odd";
 System.out.println(e);
}
}

 