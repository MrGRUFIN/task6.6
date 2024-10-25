package task6;


import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        getSumNN(x, e, n);
    }

    public static double getValueFunction(double x) { // вычисление значения функции
        return 1 / (1 + x);
    }

    public static void getSumNN(double x, double e, double n) {
        double SumN = 0; // сумма n слагаемых
        double SumNe = 0; // сумма слагаемых больше e
        double SumNe10 = 0; // сумма слагаемых больше e/10
        double q = 1; // первое слагаемое
        for (int i = 0; i < n; i++) { // в цикле for выводятся члены прогрессии, начиная с первого, затем он обновляется
            SumN += q;
            if (q > e) { // проверка слагаемого на удовлетворение условию
                SumNe += q;
            }
            if (q > (e / 10)) { // проверка слагаемого на удовлетворение условию
                SumNe10 += q;
            }
            q = q * -x; // вычисление последющего слагаемого
        }
        System.out.println("Сумма n слагаемых = " + SumN);
        System.out.println("Сумму слагаемых, которые больше e = " + SumNe);
        System.out.println("Сумму слагаемых, которые больше e/10 = " + SumNe10);
        System.out.println("Значение функции = " + getValueFunction(x));

    }
}
