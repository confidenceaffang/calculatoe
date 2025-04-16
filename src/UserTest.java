
/**
 * This provides the code for input that the program would expect.
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */
public class UserTest {

    public static void main(String[] args) {
        AdvanceCalc advCalc = new AdvanceCalc();
        boolean b = true;

        System.out.println("\n====== Advanced Calculator ======");

        int precision = Input.getIntRange("Please choose precision: ", 0, 5);
        advCalc.setPrecision(precision);

        while (b){
            System.out.println("1. Add value");
            System.out.println("2. Subtract value");
            System.out.println("3. Multiply value");
            System.out.println("4. Divide value");
            System.out.println("5. Perform square root");
            System.out.println("6. Perform power");
            System.out.println("7. Add to memory");
            System.out.println("8. Subtract from memory");
            System.out.println("9. Display memory");
            System.out.println("10. Clear memory");
            System.out.println("0. Exit");

            int choice = Input.getIntRange("Select an option (0-10)", 0,10);
            switch (choice) {
                case 1:
                    double valueToAdd = Input.getDouble("Enter Value: ");
                    advCalc.add(valueToAdd);
                    break;

                case 2:
                    double valueToSubtract = Input.getDouble("Enter Value: ");
                    advCalc.subtract(valueToSubtract);
                    break;

                case 3:
                    double valueToMultiply = Input.getDouble("Enter Value: ");
                    advCalc.multiply(valueToMultiply);
                    break;

                case 4:
                    double valueToDivide = Input.getDouble("Enter Value: ");
                    advCalc.divide(valueToDivide);
                    break;

                case 5:
                    advCalc.sqrt();
                    break;

                case 6:
                    double powerValue = Input.getDouble("Enter Power: ");
                    advCalc.pow(powerValue);
                    break;

                case 7:
                    advCalc.memoryAdd();
                    System.out.println("Current value added to the memory");
                    break;

                case 8:
                    advCalc.memorySubtract();
                    System.out.println("Current value subtracted from the memory");
                    break;

                case 9:
                    System.out.println("Memory: ");
                    advCalc.displayMemoryValue();
                    break;

                case 10:
                    advCalc.memoryClear();
                    break;

                case 0:
                    System.out.println("Exit");
                    b = false;
                    break;

            }
        }
    }
}

