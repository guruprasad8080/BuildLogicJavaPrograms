public class PowerOfNum {
    public static void main(String[] args){
        int base=5;
        int expo=2;
        int result=1;

        // result=Math.pow(base,expo);

        for(int i=1;i<=expo;i++){
            result=result*base;
        }

        System.out.println(result);

    }
}
