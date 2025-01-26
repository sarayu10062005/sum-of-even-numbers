public class EvenSum {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        while (n <= 100 || n != 101) {
            if (n % 2 == 0) {
                sum = sum + n;
                n++;
            } else {
                n++;
            }
        }
        System.out.printf("The sum of EVENs from 1-100 is: %d", sum);
    }
}