import java.util.*;

public class Stock {
	private String name; 
	private double price;
	
	public Stock(String name,double price){
		this.name=name;
		this.price = price;
	}
	
	public double getValue(){
		return price;
	}
	
	public void setValue(double price){
		this.price = price;
	}
	
	public String toString() {
		return "Stock Name: "+name+", Price: "+price;
	}
	
	public static void main (String[] args){
		Stock s1 = new Stock("AAPL",168.88);
		Stock s2 = new Stock("IBM",189.4);
		Stock s3 = new Stock("BIDU",142.05);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1.setValue(192.3);
		System.out.println(s1);
		double d1 = s1.getValue();
		System.out.println("Value of AAPL: "+d1);
		
	}
} 
