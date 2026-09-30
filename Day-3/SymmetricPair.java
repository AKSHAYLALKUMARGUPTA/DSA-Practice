import java.util.Map;
import java.util.HashMap;
public class SymmetricPair {
    public static void main(String args[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,1);
        map.put(3,4);
        map.put(4,5);
        map.put(5,4);

        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }    
}
