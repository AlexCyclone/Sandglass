package icu.cyclone.alex;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width(odd number): ");
        drawSandglass(sc.nextInt());
    }

    public static void drawSandglass(int size) {
        if (size < 3 || size % 2 == 0) {
            throw new IllegalArgumentException("Incorrect input");
        }

        int iInc = 1;
        int jInc = -2;

        for (int i = 0, j = size; j <= size; i += iInc, j += jInc) {
            char[] spaces = new char[i];
            char[] stars = new char[j];
            Arrays.fill(spaces,' ');
            Arrays.fill(stars,'*');

            System.out.print(spaces);
            System.out.println(stars);

            if (j == 1) {
                iInc = -1;
                jInc = 2;
            }
        }
    }
}
