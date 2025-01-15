public class RemoveConsCharString {
    public static void main(String[] args) {
        String str = "saabbs";
        StringBuilder sb = new StringBuilder();
        char[] charArr=str.toCharArray();
        char temp=charArr[0];
        int i=1;
        while(i<charArr.length){
            if(charArr[i]==temp){
                i++;
            }else{
                sb.append(temp);
                temp=charArr[i];
            }
            if(i==charArr.length){
                sb.append(temp);
            }
        }

        System.out.println(sb);
    }
}
