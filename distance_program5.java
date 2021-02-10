import java.util.Scanner;

class distance_program5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter x1:");
int x1=s.nextInt();
System.out.println("Enter x2:");
int x2=s.nextInt();
System.out.println("Enter y1:");
int y1=s.nextInt();
System.out.println("Enter y2:");
int y2=s.nextInt();
int ds=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
double d=Math.sqrt(ds);

System.out.println("the distance between two points is : "+d);
}
}