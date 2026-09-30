import java.util.Scanner;
public class Rearrange0and1 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[8];

    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    int i = 0; 
    int j = arr.length-1;

    while(i<j){
        if(arr[i] == 1 && arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }else if(arr[i] == 0 && arr[j] == 1){
            i++;
        }else{
            j--;
        }
    }
    for(int ele : arr)
        {
            System.out.print(ele +" ");
        }
    sc.close();
   } 
}
