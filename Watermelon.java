package Lab1;

import java.util.*;

public class Watermelon {


    static boolean CheckWaterSize(int a) {
        if (a < 1 || a > 100) {
            return false;
        }
        else
            if (a == 2) {
                return false;
            }
            else
            {
                if (a % 2 == 0) {
                    return true;
                }
                else
                    return false;
            }

        }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Size = ");
        int size =sc.nextInt();
        System.out.println();
        if (CheckWaterSize(size)){
            System.out.println("Yes");
        }
        if (CheckWaterSize(size) == false) {
            System.out.println("No");
        }
    }

}
