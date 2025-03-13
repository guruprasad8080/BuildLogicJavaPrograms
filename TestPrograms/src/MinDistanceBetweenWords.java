public class MinDistanceBetweenWords {
    public static void main(String[] args) {
        String s1="geeks for geeks contribute practice";
        String word1="geeks";
        String word2="practice";
        System.out.println("Minimum distance: " +findMinDistance(s1,word1,word2));
        String s2="the quick the brown quick brown the frog";
        String word11="quick";
        String word21="frog";
        System.out.println("Minimum distance: " +findMinDistance(s2,word11,word21));

    }

    public static int findMinDistance(String s,String w1,String w2){
        String[] words=s.split(" ");
        int minDistance=Integer.MAX_VALUE;
        int lastPosW1=-1;
        int lastPosW2=-1;

        for(int i=0;i<words.length;i++){
            if(words[i].equals(w1)){
                lastPosW1=i;
                if(lastPosW2!=-1){
                    minDistance=Math.min(minDistance,lastPosW1-lastPosW2-1);
                }
            }else if(words[i].equals(w2)){
                lastPosW2=i;
                if(lastPosW1!=-1){
                    minDistance=Math.min(minDistance,lastPosW2-lastPosW1-1);
                }
            }
        }
        return minDistance==Integer.MAX_VALUE?-1:minDistance;
    }
}
