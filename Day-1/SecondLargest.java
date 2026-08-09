public class SecondLargest {
    public static void main(String args[]){
        int arr[]={12,23,45,56,78};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && largest>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second largest number is " +secondlargest);

    }
}
