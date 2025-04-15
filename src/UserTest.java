
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

        while (b){
            System.out.println("\n====== Advanced Calculator ======");
            System.out.println("1. add value");
            System.out.println("2. subtract value");
            System.out.println("3. add to memory");
            System.out.println("4. display memory");
            System.out.println("5. clear memory");
            System.out.println("0. Exit");

            int choice = Input.getIntRange("Select an option (0-5)", 0,5);
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
                    advCalc.memoryAdd();
                    System.out.println("Current value added to memory");
                    break;

                case 4:
                    System.out.println("Memory Value");
                    advCalc.displayMemoryValue();
                    break;

                case 5:
                    advCalc.memoryClear();
                    break;



            }
        }
    }
}

