import java.util.Arrays;
public class secondLargestBySortingMethod {
    public static void main(String arg[]){
        int arr[]={12,34,44,65,32};
        Arrays.sort(arr);

        int secondLargest = arr[arr.length-2];
        System.out.println("Second largest is "+secondLargest);
    }
}
