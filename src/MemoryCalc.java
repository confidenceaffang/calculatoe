/**
 * Memory class which is a subclass or derived class from Calculator
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */

public class MemoryCalc extends Calculator {
    /*
    created and initialized a double name memoryValue to 0
     */
    protected static double memoryValue = 0.0;

    /*
    A method that displays the current memory value
     */
    public void displayMemoryValue() {
        System.out.println("Memory Value: " + memoryValue);
    }

    /*
    a method that clears the current memory value by reassigning it to 0
     */
    public void memoryClear() {
        memoryValue = 0.0;
        System.out.println("Memory Clear " + memoryValue);
    }

    /*
    a method that subtracts the currentValue from the memoryValue
     */
    public void memorySubtract() {
        memoryValue -= currentValue;
        System.out.println("Memory Subtract: " + memoryValue);
    }

    /*
    a method that returns the current memory value
     */
    public double getMemoryValue() {
        return memoryValue;
    }

    /*
 a method that adds the currentValue to the memoryValue
  */
    public void memoryAdd() {
        System.out.println("Memory Add: " + currentValue);
        memoryValue += currentValue;
    }


}
