public class ReverseNumber {
    public static void main(String args[]){

        int rem =0, sd=0;
        int n = 5432;
        while(n != 0){
            rem=n%10;
            if(sd<rem){
                sd=rem;
            }
            n=n/10;

        }
       System.out.println(sd);
    }
}
