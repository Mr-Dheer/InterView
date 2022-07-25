package Array_2D.Input;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {

        System.out.println("Enter the Numbers");

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();

        int [][] arr=new int[n][m];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]= scn.nextInt();
            }

        }

    }
}
