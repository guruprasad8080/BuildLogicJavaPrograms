import java.util.Scanner;

/* Adding fractions Program will be simple Math
*  ex: F1: 2/5 = 2*7/5*7 = 14/35
*      F2: 3/7 = 3*5/7*5 = 15/35
*      14/35 + 15/35 = 29/35
*      Ans: 29/35
* */

public class AddTwoFractions {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr1=new int[2];
        int[] arr2=new int[2];
        System.out.println("Enter numerator and denominator F1");
        for(int i=0;i<2;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter numerator and denominator F2");
        for(int i=0;i<2;i++){
            arr2[i]=s.nextInt();
        }
        addFractions(arr1,arr2);
    }

    public static void addFractions(int[] arr1 ,int[] arr2){
        int num=0;
        int den=0;

        if(arr1[1]==arr2[1]){
            num=arr1[0]+arr2[0];
            den=arr1[1];
        }else{
            num=arr1[0]*arr2[1]+arr1[1]*arr2[0];
            den=arr1[1]*arr2[1];
        }
        int temp=gcd(num,den);
        int n1=num/temp;
        int d1=den/temp;
        System.out.println("Result:- "+n1+"/"+d1);
    }

    public static int gcd(int num,int den){
        if(num==0)
            return den;
        return gcd(den%num,num);
    }
}
