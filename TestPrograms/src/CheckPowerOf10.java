public class CheckPowerOf10 {
    /* Program helps to check the given Number
    *  Ex : 100 is power of 10 it will return "Yes"
    * */
     public static void main(String[] args){
         long num=1000;
         boolean val=check(num);
         if(val){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
     }

     private static boolean check(long num){
         if(num==1) {
             return true;
         }else if(num<10){
             return false;
         }else if(num%10==0){
             return check(num/10);
         }
         return false;
     }
}
