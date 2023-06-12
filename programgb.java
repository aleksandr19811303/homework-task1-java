
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class programgb {
    public static int significantBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;

    }
  }
