public class leftAlpha {
    public static void main(String[] args){
        int n =6,a=65;
      for (int i =1; i<=n;i++){
        for (int k =5;k>=i;k--){
            System.out.print(" ");
        }
        for (int j= 0;j<i;j++){
            System.out.print((char)(a+j)+"");
        }
        System.out.println();
      }
    }
    
}
