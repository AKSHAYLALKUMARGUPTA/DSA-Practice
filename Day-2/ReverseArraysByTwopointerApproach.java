public class ReverseArraysByTwopointerApproach {
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};

        int si = 0;
        int ei = arr.length-1;

        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;

        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }

    }
}
