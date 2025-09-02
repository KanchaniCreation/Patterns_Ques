import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int num = sc.nextInt();
        int first = 0,second=1;
        for (int i=1;i<=num;i++){
            
      int fib=first+second;
       System.out.println(first);
       first=second;
       second=fib;
       
       
        }
    }
    
}
