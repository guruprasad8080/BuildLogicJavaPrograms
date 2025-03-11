import java.util.Arrays;

public class RobotPosistion {
    public static void main(String[] args) {
        String path="UDLRURL";
        int x=0;
        int y=0;

        for(char dir:path.toCharArray()){
            switch (dir){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }
        int[] result={x,y};
        System.out.println(Arrays.toString(result));
    }
}
