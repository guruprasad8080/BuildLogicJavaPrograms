public class JumpingOnCloud {
    public static void main(String[] args){
        int[] arr={0,1,0,0,0,1,0};
        int jumps=0;
        int position=0;
        while(position<arr.length-1){
            if(position+2<arr.length && arr[position+2]==0){
                position+=2;
            }else{
                position+=1;
            }
            jumps++;
        }

        System.out.println("Minimum Jumps"+jumps);
    }
}
