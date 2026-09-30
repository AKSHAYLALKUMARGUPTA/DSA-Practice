public class ArmstronNumber {
    public static void main(String args[]){
        int n = 153;
        int rem = 0, arm=0;
        int temp=n;
        while(n != 0){
            rem = n%10;

            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(temp==arm){
            System.out.println("yes it is armstrong number");
        }else{
            System.out.println("yes it is not an armstrong number");
        }
    }
}
