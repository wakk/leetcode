package easy;

import org.example.Main;

import java.util.Arrays;

/**
 * @Author: zhixiumao
 * @Description:
 * @Date: Create in 12:01 2022/12/31
 * @Modified by:
 */
public class MinMovesToSeat {
    public static void main(String[] args) {
        int[] seats=new int[]{3,1,5};
        int[] students=new int[]{2,7,4};
        minMovesToSeat(seats,students);
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int out=0;
        for (int i = 0; i < seats.length; i++) {
            out+= Math.abs(seats[i]-students[i]);
        }
        return out;

    }
}
