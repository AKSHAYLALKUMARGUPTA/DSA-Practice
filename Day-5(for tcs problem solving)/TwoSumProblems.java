import java .util.Scanner;
import java.util.Arrays;
public class TwoSumProblems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        

        System.out.println("Enter target");
            int  target = sc.nextInt();
        int arr[] = new int[6];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;
        boolean found = false;


        while(i<=j)
            {
                if(arr[i] + arr[j] == target){
                    System.out.println(i +" "+j);
                     found = true;
                    break;
                }else if(arr[i]+arr[j] > target)
                {
                    j--;
                }else{
                    i++;
                }
                
                
            }

if (!found) {
    System.out.println("-1 -1");
}

        sc.close();
    }
}
