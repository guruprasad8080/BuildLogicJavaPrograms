public class CharFollowedByNum {

    /*Given String we need to find the character count and append to that
    input:aaabbcccaa
    output:a3b2c3a2
    * */

    public static void main(String[] args) {
        String str = "saaabbss";
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
}
