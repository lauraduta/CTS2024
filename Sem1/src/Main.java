import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.calculateX5PlusY7();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.err.println("Exc Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
