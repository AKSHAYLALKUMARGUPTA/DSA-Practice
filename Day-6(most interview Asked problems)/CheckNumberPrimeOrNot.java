import java.util.Scanner;
public class CheckNumberPrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int temp=0;
        if(n<=1){
            System.out.println("Not A prime number ");
            return;
        }

        for(int i = 2; i<n; i++){
            if(n%i == 0){
                temp++;
            }
        }
        if(temp>0){
            System.out.println(n+ "Not a prime number");
        }else{
            System.out.println(n+ "yes it is a prime number");
        }
    }
}
