import java.util.*;
class VowelConsonentProgram
{
 public static void main(String[] args)
{
 System.out.println("Enter the Character:");
 char ch;
 Scanner sc=new Scanner(System.in);
 ch=sc.next().charAt(0);
 switch(ch)
 {
  case 'a':
   System.out.println("vowel");
   break; 
 case 'e':
   System.out.println("vowel");
   break;
case 'i':
   System.out.println("vowel");
   break;
case 'o':
   System.out.println("vowel");
   break;
case 'u':
   System.out.println("vowel");
   break;
default:
  System.out.println("Consonent");
  break;
}
}
}
 