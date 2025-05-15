public class SecondLargestINArray {
    public static void main(String[] args) {
        int[] arr={10,10,10};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(largest==0||num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num!=largest&&(secondLargest==0||num>secondLargest)){
                secondLargest=num;
            }

        }
        return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
    }
}
