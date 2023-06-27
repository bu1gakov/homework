import java.util.ArrayList;
import java.util.Random;

public class NoEvenNum {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            spisok.add(val);
        }
        System.out.printf("Дано: %s\n", spisok);
        int i = 0;
        while (i < spisok.size()) {
            if (spisok.get(i) % 2 == 0) {
                spisok.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без чётных чисел: %s", spisok);
    }
}