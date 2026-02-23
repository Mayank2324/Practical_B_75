import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();

        // Find even numbers between 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        // Print list
        System.out.println("Even Numbers between 1 to 50:");
        System.out.println(evenList);

        // First 3 minimum even numbers
        System.out.println("Three Minimum Even Numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.print(evenList.get(i) + " ");
        }

        System.out.println();

        // Last 3 maximum even numbers
        System.out.println("Three Maximum Even Numbers:");
        for (int i = evenList.size() - 3; i < evenList.size(); i++) {
            System.out.print(evenList.get(i) + " ");
        }

        System.out.println();

        // Calculate average
        int sum = 0;
        for (int num : evenList) {
            sum += num;
        }

        double average = (double) sum / evenList.size();
        System.out.println("Average of Even Numbers: " + average);
    }
}