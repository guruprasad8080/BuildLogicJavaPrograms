public class MinMaxSecondSmallMinMaxEle {
    public static void main(String[] args){
        int[] arr={5,6,7,8,2,1};

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secondMin=Integer.MAX_VALUE;

        for(int num:arr){
            if(num>max){
                max=num;
            }

        if(num<min){
            secondMin=min;
            min=num;
        }else if(num>min&&num<secondMin){
            secondMin=num;
        }
    }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("2nd Small: "+secondMin);
    }

}
