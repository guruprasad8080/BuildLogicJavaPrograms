public class CheckPowerOf10 {

     public static void main(String[] args){
         long num=100;
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
         }
         while(num>1){
             if(num%10!=0){
                 return false;
             }
             num/=10;
         }
         return true;
     }
}
