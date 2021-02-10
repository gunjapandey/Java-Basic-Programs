import java.util.Scanner;
class ClockAngle_program3
{
/*The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute) and hour hand moves 360 degrees in 12 hours(or 0.5 degrees in 1 minute).*/
public static void main(String args[])
{
float hangle=1,mangle=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter hours:");
float h=s.nextFloat();
System.out.println("Enter minutes:");
float m=s.nextFloat();
if(h<0||m<0||h>60||m>60)
System.out.println("Invalid Input");
else
{
if(h==12)
h=0;
if(m==60)
m=0;
hangle=(h*60+m)*6;
mangle=(h*60+m)*1/2;
}
float angle=hangle-mangle;
System.out.println("The angle between hour and minute hand of a clock : "+angle);
}
}