
public class Account{
	
	private double balance = 100000;
	private String name;
	
	public Account(String n){
		name = n;
		
	}
	public Account(String n, double bal){
		name = n;
		balance = bal;
		
	}
	
	public void buy(int amt, Stock stock){
		//super(price);
		double cost = amt * stock.getValue();
		balance-= cost;
		System.out.println("$" + cost + " has been withdrawn from your account.");
		
	}
	
	public void sell(int amt, Stock stock){
		
		double cost = amt * stock.getValue();
		balance+= cost;
		System.out.println("$" + cost + " has been deposited into your account.");
	}
	
	public void getBalance(){
		
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		
		Account a1 = new Account("Person1");
		Account a2 = new Account("Person2",540000);
		a1.getBalance();
		a2.sell(10, s1);
	
	}

}