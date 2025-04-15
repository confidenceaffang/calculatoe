
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
public class Testbench {

    public static void main(String[] args) {


        AdvanceCalc advCalc = new AdvanceCalc();

        advCalc.add(10.22);
        advCalc.subtract(2.22);
        advCalc.memoryAdd();
        advCalc.multiply(10);
        advCalc.memorySubtract();
        advCalc.divide(2);
        advCalc.setPrecision(4);
        advCalc.pow(2);
        advCalc.sqrt();
        advCalc.add(advCalc.getMemoryValue());
        advCalc.memoryClear();
        advCalc.clear();
    }
}
