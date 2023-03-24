import sweet.Candy;
import sweet.Jellybean;
import sweet.Sweet;

import java.util.Random;

public class Main {
    /**
     * Формируем сладкий подарок.
     */
    private static void collectSweetGift() {
        System.out.println("Формируем сладкий подарок.");
        Candy c1 = new Candy("Candy1", 57.5, 31.3, false);
        Candy c2 = new Candy("Candy2", 27.3, 20.0, true);
        Candy c3 = new Candy("Candy3", 13.8, 10.5, false);
        Candy c4 = new Candy("Candy4", 88.4, 50.4, true);
        Jellybean j1 = new Jellybean("Jellybean1", 15.3, 18.7, 0);
        Jellybean j2 = new Jellybean("Jellybean2", 10.5, 12.2, 1);
        Jellybean j3 = new Jellybean("Jellybean3", 20.4, 50.9, 2);
        Sweet[] gift = {c1, c2, c3, c4, j1, j2, j3};
        double giftWeight = 0;
        double giftPrice = 0;
        System.out.println("Состав подарка:");
        for (Sweet s : gift) {
            System.out.println(s.toString());
            giftWeight += s.getWeight();
            giftPrice += s.getPrice();
        }
        System.out.printf("Подарок имеет вес: %.2f грамм и общую стоимость %.2f", giftWeight, giftPrice);
    }

    /**
     * Поменять местами максимальный отрицательный и минимальный положительный элементы массива
     */
    private static void swapMaxNegAndMinPosElemOfArray() {
        System.out.println("Обмен местами максимального отрицательного и минимального положительного элементов массива.");
        final int ARR_SIZE = 20;
        int[] arr = new int[ARR_SIZE];

        final int RND_BOUND = 10; // Интервал генерируемых значений: [-RND_BOUND, RND_BOUND)
        Random rnd = new Random();

        int ELEM_NOT_FOUND = -1;
        int maxNegative = Integer.MIN_VALUE;
        int maxNegativePos = ELEM_NOT_FOUND;
        int minPositive = Integer.MAX_VALUE;
        int minPositivePos = ELEM_NOT_FOUND;

        // Инициализация массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(2 * RND_BOUND) - RND_BOUND;
        }

        System.out.print("arr (после инициализации) = {");
        System.out.print(arr[0]);
        for (int i = 1; i< arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");

        // Вычисление максимального отрицательного и минимального положительного элементов массива
        for (int i = 0; i < arr.length; i++) {
            if (0 == arr[i]) {
                continue;
            }

            if (arr[i] < 0) {
                if (arr[i] > maxNegative) {
                    maxNegative = arr[i];
                    maxNegativePos = i;
                }
            }
            else {
                if (arr[i] < minPositive) {
                    minPositive = arr[i];
                    minPositivePos = i;
                }
            }
        }

        if (ELEM_NOT_FOUND == maxNegativePos) {
            System.out.println("В массиве не обнаружено отрицательных чисел.");
            return;
        }

        if (ELEM_NOT_FOUND == minPositivePos) {
            System.out.println("В массиве не обнаружено положительных чисел.");
            return;
        }

        // Меняем местами найденные элементы
        int tmp = arr[maxNegativePos];
        arr[maxNegativePos] = arr[minPositivePos];
        arr[minPositivePos] = tmp;

        System.out.println("Максимальный отрицательный элемент массива:   " + maxNegative + ", поз: " + (maxNegativePos+1));
        System.out.println("Минимальный положительный элемент массива:    " + minPositive + ", поз: " + (minPositivePos+1));
        System.out.print("arr (после перестановки)  = {");
        System.out.print(arr[0]);
        for (int i = 1; i< arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        swapMaxNegAndMinPosElemOfArray();
        System.out.println();
        collectSweetGift();
    }
}