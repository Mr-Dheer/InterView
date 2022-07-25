package Array_2D;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("First Matrix");

        int r1=scn.nextInt();
        int c1= scn.nextInt();

//TODO        First Matrix
        int [][] one=new int[r1][c1];

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j <c1 ; j++) {

                one[i][j]=scn.nextInt();
            }

        }
//TODO      Second Matrix
        System.out.println("Enter Second Matrix");
        int r2=scn.nextInt();
        int c2=scn.nextInt();

        int [][] two=new int[r2][c2];

        for (int i = 0; i <r2 ; i++) {

            for (int j = 0; j <c2 ; j++) {

                two[i][j]=scn.nextInt();

            }
        }
        //Todo            Multipication

        if(c1!=r2)
        {
            System.out.println("Matrix Cannot be Multiplied");
        }
        int [][] prod=new int[r1][c2];

        for (int i = 0; i <prod.length ; i++) {
            for (int j = 0; j <prod[i].length ; j++) {

                for (int k = 0; k <c1 ; k++) {
                    prod[i][j]+=one[i][k]*two[k][j];

                }

            }

        }
        System.out.println("Answer :)");
        for (int i = 0; i <prod.length ; i++) {

            for (int j = 0; j < prod[i].length ; j++) {

                System.out.print(prod[i][j]+" ");


            }

            System.out.println();

        }


    }
}
