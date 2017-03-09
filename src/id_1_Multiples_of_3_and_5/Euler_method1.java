package id_1_Multiples_of_3_and_5;

public class Euler_method1 {
    public static int SumOfMultiples (int number) {
        int sum = 0;

        for (int i = 3; i < number; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Number = " + number);
        System.out.println("Sum of multiples of 3 or 5 = " + sum);
        return sum;
    }
}
