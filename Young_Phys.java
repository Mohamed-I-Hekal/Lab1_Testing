package Lab1;

import java.util.Scanner;

public class Young_Phys {


    public static boolean ChkValid(int a){
        return a >= -100 && a <= 100;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of vectors = ");
        int n = sc.nextInt();
        System.out.println();
        int [][]force = new int[n][3];
        int []equilibrium_check= new int[3];
        boolean valid=true;
        for (int i = 0; i < n; i++) {
            System.out.println("Points = ");
            for (int j = 0; j < 3; j++) {
                force[i][j] = sc.nextInt();
                if (!ChkValid(force[i][j])){
                    valid = false;
                    equilibrium_check[j]+=force[i][j];
                }
            }
            System.out.println();
        }

        if((equilibrium_check[0]==0)&&(equilibrium_check[1]==0)&&(equilibrium_check[2]==0)&&(valid))
            System.out.println("YES");
        else
            System.out.println("NO");

    }


}
