import java.util.Scanner;

public class RemoveDuplicatesByTwoPointerMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        
       
        int arr[] = new int[n];

        

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int i = 0; 
        int j = i+1;

        while(j<arr.length ){
            if(arr[i] == arr[j]){
                j++;
                
            }else{
                 
                i++;
                arr[i] = arr[j];
                j++;
            }
            
        }
       for(int k = 0; k <= i; k++) {
    System.out.print(arr[k] + " ");
}
       
    }
}
