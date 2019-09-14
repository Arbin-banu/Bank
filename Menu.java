import java.util.Scanner;
class Menu{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
for(;;)
{
 System.out.println("Enter your choice");
 System.out.println("1-customer block");
System.out.println("2-staff block");
System.out.println("3-Admin block");
a=sc.nextInt();

switch(a){

case 1:System.out.println("cutomer block");
	break;
case 2:System.out.println("staff block");
	break;
case 3:System.out.println("admin block");
	break;
default:System.out.println("default block");
	break;

}
}
}
}