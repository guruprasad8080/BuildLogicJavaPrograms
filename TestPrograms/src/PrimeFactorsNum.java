public class PrimeFactorsNum {
    public static void main(String[] args){
        int num=84;
        findPrimefactor(num);
    }
    private static void findPrimefactor(int n){
        while(n%2==0){
            System.out.print(2+" ");
            n/=2;
        }

        for(int i=3;i<=Math.sqrt(n);i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
}
