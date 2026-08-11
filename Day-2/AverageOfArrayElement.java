public class AverageOfArrayElement {
        public static void main(String args[]){
        int arr[] = {1,2,1,1,5,1};

        int n = arr.length;
            float avg = 0;
        for(int i=0; i<arr.length; i++){
            avg += arr[i];
        }
        avg /=n;
        System.out.print(avg);
    }
}
