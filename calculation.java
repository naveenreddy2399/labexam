import  x.*;
import java.util.*;
public class main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur desired numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		x.add a = new x.add();
		x.div d = new x.div();
		x.sub s = new x.sub();
		x.mul m = new x.mul();
		System.out.println("Pick up the choices 1.add 2.sub 3.mul 4.div 5.mod");
		int choice = sc.nextInt();
		if(choice==1)
		{a.Addition(x,y);}
		else if(choice==2)
		{s.subtraction(x,y);}
		else if(choice==3)
		{m.Mult(x,y);}
		else if(choice==4)
		{d.Divi(x,y);}
	}
}

