import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//clean code implemented
public class Calculator {

    public double calculateX5PlusY7() throws IOException {
        double x = readDoubleFromInput("X");
        double y = readDoubleFromInput("Y");

        double x5 = calculatePower(x, 5);
        double y7 = calculatePower(y, 7);

        return x5 + y7;
    }

    private double readDoubleFromInput(String variable) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(variable + ":");
        return Double.parseDouble(reader.readLine());
    }

    private double calculatePower(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

//old, bad code
/* public class Calculator {
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("X:");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("Y:");
        double y = Double.parseDouble(reader.readLine());

        double x5 = x;
        for (int i = 1; i < 5; i++) {
            x5 *= x;
        }

        double y7 = y;
        for (int i = 1; i < 7; i++) {
            y7 *= y;
        }

        result = x5 + y7;
        return result;
    }
}
*/

