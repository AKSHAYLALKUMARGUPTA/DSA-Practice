import java.util.*;
class FirstUniqueElement{
    public static void main(String args[]){
        int[] arr = {2, 5, 2, 7, 5, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : arr){
           if(!map.containsKey(ele)){
            map.put(ele,1);
           }else{
            
            map.put(ele,map.get(ele)+1);
           }
        }
        for(int ele : arr){
            if(map.get(ele)==1){
                System.out.print(ele);
                break;
            }
        }

    }
}