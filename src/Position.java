
public class Position {
	private String name;
	private int amount;
	
	Position(String a){
		name=a;
		amount=0;
	}
	Position(String a,int b){
		name=a;
		amount=b;
	}
	public String getName(){
		return name;
	}
	public int getAmout(){
		return amount;
	}

	public void buySomeThing(int bst){
		amount+=bst;
	}

}
