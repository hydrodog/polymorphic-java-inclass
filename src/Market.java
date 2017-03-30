import java.io.File;
import java.io.IOException;
import java.util.*;
/**
 * Created by Zhenzhen Liu on 3/27/17.
 */
public class Market {
    private HashMap<String, Double> map;
    public Market(){
        map = new HashMap<String, Double>();
        try{
            load();
        }catch(IOException e)
        {
            System.out.print(e.toString());
        }
    }
    public boolean NYSEhave(String name){
        return map.containsKey(name);
    }

    public double getPrice(String code){
        double price =  map.get(code).doubleValue();
        return price;
    }

    public void load() throws IOException{
        File f = new File("test.txt");
        Scanner sc = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext())
        {
            sb.append(sc.next()).append(",");
        }

        String[] arr = sb.toString().split(",");

        for(int i = 0; i<arr.length-1; i+=2)
        {
            map.put(arr[i], Double.parseDouble(arr[i+1]));
        }
    }

    public static void main(String[] args) throws IOException{
    }
}
