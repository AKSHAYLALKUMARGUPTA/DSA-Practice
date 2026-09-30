
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String args[]){
        int[] arr = {1,1,2,2,2,3,3};

        
        HashSet<Integer> set=new HashSet<>();

        for(int ele : arr){
            set.add(ele);
        }

        System.out.println(set);
    }
}
