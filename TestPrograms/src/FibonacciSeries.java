public class FibonacciSeries {
    public static void main(String[] args){
        int n=10;
        System.out.println("Fibboncci Series: "+fibonacci(n));
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int prev1=1,prev2=0;
        int current=0;
        System.out.println(prev2+ "\n" +prev1); //line is to print the fibo series
        for(int i=2;i<n;i++){
            current=prev2+prev1;
            System.out.println(""+current); //line is to print the fibo series
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}
