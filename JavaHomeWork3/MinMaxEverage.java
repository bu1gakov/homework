import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class MinMaxEverage {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            spisok.add(val);
        }
        System.out.printf("Дано: %s\n", spisok);
        int max = max(spisok);
        int min = min(spisok);
        int maxItem = spisok.get(0);
        int minItem = spisok.get(0);
        int sumItems = 0;
        for (int item : spisok) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/spisok.size();
        System.out.printf("Минимальный элемент: %s\n", minItem);
        System.out.printf("Максимальный элемент: %s\n", maxItem);
        System.out.printf("Среднее арифметическое: %s\n", average);
    }
}