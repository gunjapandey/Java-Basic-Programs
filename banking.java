class account{
    
    String accno;
    String name;
    String type;
    int minbal;
    int balance;
    String mobile;
    account(){
        name="Riya";
        accno="567584464567";
        type="Savings";
        minbal=10000;
        balance=100000;
        mobile="9453661051";
    }
    account(String n , String an)
	{
        name=n;
        accno=an;
        type="current";
    	}
    account(account ob){
        name="Satva";
        type="ERS";
        accno=ob.accno;
        minbal=ob.minbal;
        balance=ob.balance;
    }
    void display(){
        System.out.println( "Name: "+name);
        System.out.println( "ACCOUNT type: "+type);
        System.out.println( "Account number:  "+accno);

    }
    void credit(int c){
        balance=balance+c;
        System.out.println("Amount credited-"+c);
        System.out.println("Remaining balance-"+balance);
    }
    void debit(int d){
        balance=balance-d;
        System.out.println("Amount debited-"+d);
        System.out.println("Remaining balance- "+balance);
    }


}
public class banking
{
    public static void main(String arg[]) {
        account obj= new account();
        System.out.println("Constructor without  parameter-");
        obj.display();
	System.out.println("");
        System.out.println("Constructor with parameter-");
        account obj2= new account("Kartik","25672458731");
        obj2.display();
	System.out.println("");
        System.out.println("Constructor with Object as parameter-");
        account obj3= new account(obj);
        obj3.display();
	System.out.println("");
        obj.credit(400);
	System.out.println("");
	obj.debit(500);
    }
}
