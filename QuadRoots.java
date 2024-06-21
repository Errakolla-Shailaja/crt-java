import java.util.*;
class QuadRoots
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
int d=b*b-4*a*c;
if(d<0)
System.out.println("Imaginary Roots");
else{
float r1=(float)((-b+Math.sqrt(d))/(2*a));
float r2=(float)((-b-Math.sqrt(d))/(2*a));
System.out.println("r1= "+r1+" \nr2="+r2);
}
}
}