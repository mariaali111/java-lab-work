public class Problem01 {
    public static void main(String[] args) {
        int[] d = {-1, 0, 1, 3, 4, 6, 12};

        for (int i = 0; i < d.length; i++) {
            try {
                System.out.println("Dividing 12 by " + d[i]);
                System.out.println("Result = " + 12 / d[i]);
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            }
            System.out.println("-----------------------------");
        }

        System.out.println("Rest of the code...");
    }
}
