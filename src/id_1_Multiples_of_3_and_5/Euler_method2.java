package id_1_Multiples_of_3_and_5;

public class Euler_method2 {
    public static int SumOfMultiples (int number) {
        int sum = 0;

        for (int i = 3; i < number; i += 3) {
            sum += i;
        }
        for (int i = 5; i < number; i += 5) {
            sum += i;
        }
        for (int i = 15; i < number; i += 15) {
            sum -= i;
        }

        System.out.println("Number = " + number);
        System.out.println("Sum of multiples of 3 or 5 = " + sum);
        return sum;
    }
}
