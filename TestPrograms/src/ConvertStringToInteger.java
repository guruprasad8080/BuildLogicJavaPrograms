public class ConvertStringToInteger {
    public static void main(String[] args) {
        System.out.println(31==checkStrToInt("-123abc$567"));
        System.out.println(131==checkStrToInt("131"));
    }

    public static int checkStrToInt(String str){
        if(str==null||str.isEmpty()){
            System.out.println("Input String is Null or Empty");
        }
        int result=0;int sign=1;
        int i=0;
        if(str.charAt(0)=='-'){
            sign=-1;
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        for (;i<str.length();i++){
            char c=str.charAt(i);
            if(c<'0'||c>'9'){
                System.out.println("Input is not Valid");
            }
            result=result*10+(c-'0');
        }
        System.out.println(result*sign);
        return result*sign;
    }

}
