// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

import java.util.ArrayList;

public class programmax {
    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
            ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; ++j) {
        if (j % n == 0) {
            list.add(j);
            }
        }
        return list;
    }

}