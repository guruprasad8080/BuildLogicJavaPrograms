public class ProductOfTwoArrays {
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={2,4,7};
        int dotProd=0;
        try{
            if(a.length!=b.length) {
                throw new Exception("Array Must be Same size");
            }else{
                for(int i=0;i<a.length;i++){
                    dotProd+=a[i]*b[i];
                }
                System.out.println(dotProd);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
