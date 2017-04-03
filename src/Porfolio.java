import java.util.*;

public class Portfolio {
	private String ownerName;
	private double currMoney;
//	private ArrayList<Position> WhichIHave;
	private ArrayList<Position> WhichIHave=new ArrayList<Position>();
	Market myMarket=new Market();
	
	Portfolio(String name,double cM){
		ownerName=name;
		currMoney=cM;
	}
	
	
	
	public void addMoney(double val){
		currMoney+=val;
	}
	public double getCurrMoney(){
		System.out.println("You have "+currMoney+" Dollar.");
		return currMoney;
	}
	
	public void buy(String name,int val){
		//Is There this Stocks?
			if(!myMarket.NYSEhave(name)){
				System.out.println("We don`t have");
				return;
			}
		double price=myMarket.getPrice(name);
		
		//afford?
//			double price=100;//for test
			if(val*price>currMoney){
				System.out.println("Can`t afford!");
				return;
			}
		
		//buy!
		
		int Index=WhichIHave.indexOf(name);
		if(Index==-1){	//don`t have
			WhichIHave.add(new Position(name,val));
			currMoney-=(val*price);
		}else{			//have had
			WhichIHave.get(Index).buySomeThing(val);
		}
		System.out.println("Success! You bought "+val+' '+name+" Stocks");
		
	}
	
	
	public static void main(String[] args) {
		Portfolio p1= new Portfolio("zx",100000);
		p1.buy("App",10);
		p1.getCurrMoney();
		p1.buy("APPL",100);
		p1.getCurrMoney();
		
		
	}

}
