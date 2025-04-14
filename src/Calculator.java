/**
 * The Calculator class implementation which is derived from the implementation of the Interface BasicMath
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */

public class Calculator implements BasicMath {

    /**
     * Creates a double and initializes named previousValuye
     */
    protected double previousValue;

    /**
     * Creates a double and initializes named inputValue
     */
    protected double inputValue;

      /**
       * Creates a double and initializes named currentValue
       */
    protected double currentValue;

    /**
     * Creates the character and initializes named operator
     */
    protected char operator = '?';


    /**
     * a method that clears the current value by reassigning it to zero similar to the memoryClear method in the MemoryCalc class
     */
    public void clear() {
        currentValue = 0.0;
    }


    /**
     * Creates an override method for the add method from the BasicMath interface with the generic value N pass to it
     *
     * @param value the value to add
     * @param <N> the type of the value, which extends Number
     */
    @Override
    public <N extends Number> void add(N value) {
        operator = '+';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }

    /**
     * creates an overided method for the subtract method from the BasicMath interface with the generic value N pass to it
     *
     * @param value the value to subtract
     * @param <N> the type of the value, which extends Number
     */
    @Override
    public <N extends Number> void subtract(N value) {
        operator = '-';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue -= inputValue;
        updateDisplay();
    }

    /**
     * creates an overided method for the multiply method from the BasicMath interface with the generic value N pass to it
     *
     * @param value the value to multiply by
     * @param <N> the type of the value, which extends Number
     */
    @Override
    public <N extends Number> void multiply(N value) {
        operator = '*';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue *= inputValue;
        updateDisplay();
    }

    /**
     * creates an overided method for the divide method from the BasicMath interface with the generic value N pass to it
     *
     * @param value the value to divide by
     * @param <N> the type of the value, which extends Number
     */
    @Override
    public <N extends Number> void divide(N value) {
        operator = '/';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue /= inputValue;
        updateDisplay();
    }

    /**
     * Method to display the output on the screen
     */
    public void updateDisplay() {
        System.out.println();
        System.out.printf(" %,12.2f%n", previousValue);
        System.out.printf("%1s%,12.2f%n", operator, inputValue);
        System.out.println("===========");
        System.out.printf("%,12.2f%n", currentValue);
        System.out.println();
    }
}
