package com.company;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.print("Введите количество купюр \n");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(), n2 = in.nextInt(),n3 = in.nextInt(), n4 = in.nextInt();
        int mas[] = new int[4];
        int sum = n1 * 1000 + n2 * 500 + n3 * 100 + n4 * 30;

        System.out.print("Введите нужную сумму \n");
        int x = in.nextInt();
        if (x > sum || (x % 10 != 0)) {
            System.out.print("Ошибка! Невозможно выдать сумму!\n");
        } else {
            while (n1 > 0 && x - 1000 >= 0) {
                x -= 1000;
                n1--;
                mas[0]++;
            }
            while (n2 > 0 && x - 500 >= 0) {
                x -= 500;
                n2--;
                mas[1]++;
            }
            while (n3 > 0 && x - 100 >= 0) {
                x -= 100;
                n3--;
                mas[2]++;
            }
            while (x % 100 != 0 && x > 0 && n4 > 0) {
                x -= 30;
                n4--;
                mas[3]++;
            }
            if (x == 0) {
                System.out.print(mas[0] + " 1000 рублевых купюр, " + mas[1] + "500 рублевых купюр, \n"
                        + mas[2] + " 100 рублевых купюр, " + mas[3] + " 30 рублевых купюр");
            }
            else System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        }

    }
}
