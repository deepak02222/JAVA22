package day4;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}

public class ex4 extends Withdrawal{
		FixedAmount f1=new FixedAmount();
		void withdraw(int amount) {
			f1.fixedamount -= amount;
			System.out.println("withdrawn:" +amount);
			System.out.println("available Balance: " +f1.fixedamount);
		}
		public static void main(String[] args) {
			int amount = Integer.parseInt(args[0]);
			ex4 d= new ex4();
			d.withdraw(amount);
		}
		

	}


