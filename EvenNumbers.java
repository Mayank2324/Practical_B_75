public class EvenNumbers {
    public static void main(String[] args) {

        int min = 2;
        int max = 100;
        int sum = 0;

        System.out.println("Even Numbers between 1 and 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }
}
