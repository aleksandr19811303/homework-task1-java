// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.ArrayList;

public class programmin {
   
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {   
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
        if (j % n != 0) {
            list.add(j);
            }
        }
        return list;
    }

}


    
