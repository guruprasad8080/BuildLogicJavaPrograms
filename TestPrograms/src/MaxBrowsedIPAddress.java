import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxBrowsedIPAddress {

    public static void main(String[] args){
        String[] ipAddrss={"10.45.05-ab/cc/xyz","10.45.05-ab/cc/xyz","10.34.40-abc/cc/xxx","10.45.34-acb/vbg/vv"};
        Map<String,Integer> hashMap=new HashMap<String,Integer>();
        for (String addrss : ipAddrss) {
            String strKey = addrss.substring(0, addrss.indexOf("-"));
            if (hashMap.containsKey(strKey)) {
                hashMap.put(strKey, hashMap.get(strKey) + 1);
            } else {
                hashMap.put(strKey, 1);
            }
        }

        int strMax= Collections.max(hashMap.values());

        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            if(strMax==entry.getValue()){
                System.out.println(entry.getKey()+" ");
            }
        }
    }
}
