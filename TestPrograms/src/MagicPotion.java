public class MagicPotion {

    public static void main(String[] args) {
        String str="ABCABCE";
        System.out.println(encodeString(str));
    }

    public static String encodeString(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
          if(i*2<str.length()) {
              String subStr = str.substring(0, i);
              if (subStr.equals(str.substring(i, i * 2))) {
                  sb.append("*");
                  i = 2 * i - 1;
              } else {
                  sb.append(str.charAt(i));
              }
          }else{
              sb.append(str.charAt(i));
          }
        }
        return sb.toString();
    }
}
