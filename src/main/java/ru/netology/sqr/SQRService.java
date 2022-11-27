package ru.netology.sqr;

public class SQRService {

    public static int NumberSQR(int startRange, int endRange) {
        int countSqr = 0; // инициализируем счетчик
        for (int i = 10; i < 100; i++) {
            boolean moreLeft = i * i >= startRange; //больше или равно левой границы диапазона
            boolean lessRight = i * i <= endRange;  //меньше или равно правой границы диапазона
            if (moreLeft & lessRight) {
                countSqr++; // если попадает, увеличиваем счетчик
            }
            if ((i * i) > endRange) {
                break; // чтобы зря не мучить программу
            }
        }
        return countSqr;
    }
}
