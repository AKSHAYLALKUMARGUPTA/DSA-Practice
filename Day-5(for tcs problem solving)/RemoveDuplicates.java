import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        
       
        int arr[] = new int[n];

        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i<arr.length; i++){
            if(visited[i]){
                continue;
            }
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                }
            }
            if(visited[i]){
                System.out.println(arr[i]);
            }
        }
       
    }
}
