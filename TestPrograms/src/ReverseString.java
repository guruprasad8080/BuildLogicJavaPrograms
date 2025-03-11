public class ReverseString {
    public static void main(String[] args){

        String str="Guruprasad";
        System.out.println(reverseStringUsingStringBuildder(str));
        System.out.println(reverseStringUsingTwoPointers(str));

    }

    //Reverse String Using Two Pointers
    public static String reverseStringUsingTwoPointers(String str){
        char[] charArray=str.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while(left<right){
            //Swap the Character at left and right pointers
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    //Reverse String Using StringBuilder
    public static String reverseStringUsingStringBuildder(String str){
        StringBuilder reversed=new StringBuilder();
        //Traverse the String from end to start
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

    }
}
