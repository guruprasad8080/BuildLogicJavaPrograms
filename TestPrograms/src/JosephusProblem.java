public class JosephusProblem {

    public static void main(String[] args){
        int n=7;
        int k=3;

        int position=josephus(n,k);
        System.out.println("The chosen position is: "+position);
    }

    public static int josephus(int n,int k){
        if(n==1)
            return 0;
        else
            return (josephus(n-1,k)+k)%n;
    }

}
