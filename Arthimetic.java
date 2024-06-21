import java.util.*;
class Arthimetic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
System.out.println("Enter Your Choice(1/2/3/4)");
int choice;
choice=s.nextInt();
switch(choice){
case 1:c=a+b;
            System.out.println("Addition:"+c);
            break;
case 2:c=a-b;
            System.out.println("Subtraction:"+c);
            break;
case 3:c=a*b;
            System.out.println("Multiplication:"+c);
            break;
case 4:c=a/b;
            System.out.println("Division:"+c);
            break;
} 
}
}