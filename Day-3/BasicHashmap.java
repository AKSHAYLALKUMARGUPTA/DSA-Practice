import java.util.Map;
import java.util.HashMap;

public class BasicHashmap {
    public static void main(String args[]){

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Rahul",92);
        map.put("Amit",85);
        map.put("Priya",80);

        //loop for trverse the hashmap key at a time 

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +  " -> "  + entry.getValue());
            
           
        }
    }
}
