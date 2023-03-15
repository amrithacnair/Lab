import java.util.Scanner;
class SwappingProgram
{
 public static void main(String[] args)
{
 int m,n,temp;
 System.out.println("Enter the First number:");
 Scanner sc=new Scanner(System.in);
 m=sc.nextInt();
System.out.println("Enter the Second number:");
 n=sc.nextInt();
 System.out.println("Before Swapping the Values Are......\n"+m+"\n"+n);
 temp=m;
  m=n;
  n=temp;
System.out.println("After Swapping......\n"+m+"\n"+n);
}
}

 