/*
Created a class called AdvanceCal to handle advance calculation which is an implementation of the AdvancedMath interface and a subclass of MemoryCalc
 */
public class AdvanceCalc extends MemoryCalc implements AdvanceMath {
    /*
    creates an initializes a field integer named precision to 1
     */
    protected int precision = 2;

    /*
    creates a method called setPrecision which is basically a constructor that sets the value of precision
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /*
     creates an overided method for the square root method from the AdvanceMath interface
      */
    @Override
    public void sqrt() {
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }

    /*
 creates an overided method for the power method from the AdvanceMath interface with the generic value N pass to it
  */
    @Override
    public <N extends Number> void pow(N value) {
        operator = '\u005E';
        previousValue = currentValue;
        inputValue = value.doubleValue();
        currentValue = Math.pow(previousValue, inputValue);
        updateDisplay();
    }

    /*
 creates an overided method for the uodateDisplay method from the MemoryCal which is also a subclass of Calaulator that has this method
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


}

