import java.util.*;
class PosNeg
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a;
a=s.nextInt();
if(a>0)
System.out.println("Positive Number");
else if(a<0)
System.out.println("Negative Number");
else
System.out.println("Zero");
}
}