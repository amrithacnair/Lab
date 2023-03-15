import java.util.*;
class SwapingWithoutTemp
{
 public static void main(String[] args)
 {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The FirstNumber");
   a=sc.nextInt();
   System.out.println("Enter The Second Number");
   b=sc.nextInt();
   System.out.println("The Numbers Before Swapping First Number..."+a+"..Second Number...."+b);
   System.out.println("The Numbers After Swapping");
   a=(a+b);
   b=a-b;
   a=a-b;
   System.out.println(a+"\n"+b);
 }
}