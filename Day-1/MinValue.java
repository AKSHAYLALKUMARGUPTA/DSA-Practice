import java.util.Scanner;
public class MinValue{
    public static int MinElement(int arr[],int min){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        

        System.out.println("Enter arrays elements");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int minValue=MinElement(arr,min);
        System.out.println("Smallest elements in the array is " +minValue );
        sc.close();
    }
}
