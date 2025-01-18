public class TrappingRainWater {

    /* @author Guruprasad
    TimeComplexity -> O(n)
    SpaceComplexity -> O(1)
    */

    public static void main(String[] args){

        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Water Trapped: "+ trapWater(height));

    }

    public static int trapWater(int[] height){

        int leftMax=0,rightMax=0;
        int left=0,right=height.length-1;
        int waterTrapped=0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax=height[left];
                }else{
                    waterTrapped+=leftMax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }else{
                    waterTrapped+=rightMax-height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
