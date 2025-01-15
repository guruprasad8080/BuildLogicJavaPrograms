public class LengthEncodingString {
    public static void main(String[] args){
        String str="aaabbccddeeaa";
        StringBuilder sb=new StringBuilder();
        char[] charArr=str.toCharArray();
        char temp=charArr[0];
        int count=1;
        int i=1;
        while(i<charArr.length){
            if(charArr[i]==temp){
                count++;
                i++;
            }else{
                sb.append(temp);
                sb.append(count);
                temp=charArr[i];
                count=1;
                i++;
            }
            if(i==charArr.length){
                sb.append(temp);
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}
