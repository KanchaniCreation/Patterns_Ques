import java.util.Scanner;
public class kShape { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
int a=65;
        for(int i =num;i>=1;i--){
            for (int j=0;j<=i;j++) {
                System.out.print((char)(a+j)+"");
            }
            System.out.println();
        }
        for (int i =1;i<num;i++){
            for (int j=0;j<=i;j++){
            System.out.print((char)(a+j)+"");
        }
        System.out.println();
    }
}  
}
