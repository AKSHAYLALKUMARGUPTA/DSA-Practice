import java.util.*;
public class frequency {
    public static void main(String aargs[]){
        int arr[] = {1,3,2,1,4,2,3,2,4};
        
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int ele : arr){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.put(ele,1)+1);
            }
       }
       System.out.println(map);
        
    }
}
