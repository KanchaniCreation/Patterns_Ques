public class fibo {
    public static void main(String[] args){
        int first = 0,second=1;
        for (int i=0;i<=9;i++){
            
      int fib=first+second;
       System.out.println(first);
       first=second;
       second=fib;
       
       
        }
    }
    
}
