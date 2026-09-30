import java.util.Scanner;
class FabonanciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        
        int c;
        
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){

            System.out.print(a +" ");
             c = a+b;

            
            a=b; 
            b=c;
        }
        sc.close();
    }
}