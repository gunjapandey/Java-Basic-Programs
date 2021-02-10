import java.util.Scanner;
class population_lab2_program2
{
public static void main(String args[])
{
int p=1000;
for(int i=1;;)
{p=(110*p)/100;
System.out.println(p);
if(p==30000)
break;
}
}
}