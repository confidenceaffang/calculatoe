
/**
 *  The code in AdvanceCalc provides code for using a simple calculator.
 *  It extends the MemoryCalc class and implements the AdvanceMath interface.
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */

public class AdvanceCalc extends MemoryCalc implements AdvanceMath {
    /**
     * creates an initializes a field integer named precision to 2
     */
    protected int precision = 2;

    /**
     * Creates a method called setPrecision which is basically a constructor that sets the value of precision
     *
     * @param precision the number of decimal places to display
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * Creates an overided method for the square root of the current value
     * Overrides the sqrt method from the AdvanceMath interface
     */
    @Override
    public void sqrt() {
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }

    /**
     * creates an overided method for the power method from the AdvanceMath interface with the generic value N pass to it
     *
     * @param value the exponent to raise the current value to
     * @param <N> the type of the exponent, which extends Number
     */
    @Override
    public <N extends Number> void pow(N value) {
        operator = '\u005E';
        previousValue = currentValue;
        inputValue = value.doubleValue();
        currentValue = Math.pow(previousValue, inputValue);
        updateDisplay();
    }

    /**
     * creates an overided method for the uodateDisplay method from the MemoryCal which is also a subclass of Calaulator that has this method
     */
    @Override
    public void updateDisplay() {
        String format1 = " %,12." + precision + "f%n"; // used to jsut dipslay one value
        String format2 = "%1s%,12." + precision + "f%n"; // used to display the operator plus the inputValue

        if (operator == '\u221A') { // square root with no input value
            System.out.printf(format2, operator, previousValue);
        } else {
            System.out.printf(format1, previousValue);
            System.out.printf(format2, operator, inputValue);
        }

        System.out.println("==============");
        System.out.printf(format1, currentValue);
        System.out.println();

    }

    @Override
    public void displayMemoryValue() {
        String format = " %,12." + precision + "f%n"; // used to jsut dipslay one value
        System.out.printf(format, memoryValue);
    }

}

