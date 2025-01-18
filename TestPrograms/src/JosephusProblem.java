public class JosephusProblem {

    public static void main(String[] args){
        int n=4;
        int k=2;

        int position=josephus(n,k);
        System.out.println("The chosen position is: "+position);
    }

    public static int josephus(int n,int k){
        if(n==1)
            return 1;
        else
            return (josephus(n-1,k)+k-1)%n+1;
    }

}
