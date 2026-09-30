import java.util.Arrays;
public class RemoveDuplicateByTwoPointer {
    public static void main(String args[]){
        int[] arr ={1,1,2,2,2,3,3};
        Arrays.sort(arr);
        int n = arr.length-1;
        int i = 0;
        int j=i+1;
        while(i<n){
            if(arr[i]== arr[j]){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(arr[i]);
    }
}
