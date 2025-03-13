public class JosephusProblem {
    /*The Josephus Problem is a theoretical puzzle related,
     to a group of people standing in a circle and being eliminated in a specific order until only one remains.
     It has historical origins and practical applications in computer science and game theory.
     Given:
          n: Number of people standing in a circle.
          k: Step count for elimination (every k-th person is removed).
    * */
    public static void main(String[] args){
        int n=7;
        int k=3;

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
