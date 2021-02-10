import java.util.Scanner;
class SimpleInterest_program2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Priniciple:");
int P=s.nextInt();
System.out.println("Enter rate:");
float R=s.nextFloat();
System.out.println("Enter Time:");
int T=s.nextInt();

float I=(P*R*T)/100;
System.out.println("The Simple Interest is : "+I);
}
}