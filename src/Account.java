
public class Account{
	
	private double balance = 100000;
	
	
	public Account(){
		
	}
	
	public void buy(int amt, Stock stock){
		//super(price);
		double cost = amt * stock.getprice();
		balance-= cost;
		
	}
	
	public void sell(int amt, String stock, double price){
		double tempBalance;
		tempBalance = amt * price;
		balance+= tempBalance;
	}
	
	public static void main(String[] args) {
	
	}

}