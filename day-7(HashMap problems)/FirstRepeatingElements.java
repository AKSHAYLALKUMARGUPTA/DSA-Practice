import java.util.*;
public class FirstRepeatingElements {
    public static void main(String args[]){
        int[] arr = {4, 2, 7, 2, 5, 4};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
               
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i])>1){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
