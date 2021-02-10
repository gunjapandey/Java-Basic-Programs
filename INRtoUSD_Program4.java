import java.util.Scanner;
class INRtoUSD_Program4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x;
System.out.println("Choose from the choice given below:"+"\n"+"1:Convert INR to USD"+"\n"+"2:Convert USD to INR");
System.out.println("Enter Choice");
int c=s.nextInt();
switch(c)
{
case 1:
System.out.println("Enter amount in INR");
double i=s.nextDouble();
double u=i*0.014;
System.out.println("INR converted into USD : "+u);
break;
case 2:
System.out.println("Enter amount in USD");
u=s.nextDouble();
i=u*73.12;
System.out.println("USD converted into INR : "+i);
break;
default:
System.out.println("Invalid choice");
}
}
}