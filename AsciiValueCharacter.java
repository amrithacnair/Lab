import java.util.*;
class AsciiValueCharacter
{
 public static void main(String[] args)
 {
  char c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter The character");
  c=sc.nextLine().charAt(0);
  System.out.println("The Character is ..."+c);
  int a=c;
  System.out.println("The Ascii value is....."+a);
}
}