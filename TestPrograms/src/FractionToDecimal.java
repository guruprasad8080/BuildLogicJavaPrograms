import java.util.HashMap;
import java.util.Map;

/*Problem Statement:
Given fraction of number if the number is divided by even we need to response as it,
if it is divided by odd number the repeating character in repeating sequence should be placed in "()" .
Ex: input 1 - 1/2 =0.5
    input 2 - 1/3 =0.(3) -> 0.33333...
    input 3 - 2/7 =0.(2857142)  -> 0.2857142 2857142 2857142...
* */
public class FractionToDecimal {

    public static String fractionToDecimalConvert(int numerator,int denominator){
       //Handle the case of Zero numerator
        if(numerator==0){
            return "0";
        }
        //Step 1:Determine the sign of the result
        StringBuilder result=new StringBuilder();
        Map<Long,Integer> reminderMap=new HashMap<>();

        //Step 2:Work with absolute values to simplify the process
        long num=Math.abs((long) numerator);
        long den=Math.abs((long) denominator);

        if((numerator<0^denominator<0)){
            result.append("-");
        }
        //Step 3:Integer part of the fraction
        result.append(num/den);
        num=num%den;

        //If there is no reminder we're done
        if(num==0){
            return result.toString();
        }

        //Step 4:Handle the decimal part
        result.append(".");
        int index=result.length();

        //Step 5:Keep track of the reminders and their positions
        while(num!=0){
            //If we have seen this reminder before, the digits are repeating
            if(reminderMap.containsKey(num)){
                int repeatIndex=reminderMap.get(num);
                result.insert(repeatIndex,"(");
                result.append(")");
                break;
            }

            //Otherwise, store the position of this reminder
            reminderMap.put(num,index++);
            //Step 6: Perform long division
            num*=10;
            result.append(num/den);
            num=num%den;
        }
        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(fractionToDecimalConvert(-1,2));
        System.out.println(fractionToDecimalConvert(1,3));
        System.out.println(fractionToDecimalConvert(2,7));
        System.out.println(fractionToDecimalConvert(-1,-6));
        System.out.println(fractionToDecimalConvert(4,-9));
        System.out.println(fractionToDecimalConvert(1,5));
        System.out.println(fractionToDecimalConvert(4,2));

    }

}
