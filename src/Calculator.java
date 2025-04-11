/*
The Calculator class implementation which is derived from the implementation of the Interface BasicMath
 */
public class Calculator implements BasicMath {
    /*
    Creates a double and initializes named previousValuye
     */
    private double previousValue = 0.0;
    /*
   Creates a double and initializes named inputValue
    */
    private double inputValue = 0.0;
      /*
   Creates a double and initializes named currentValue
    */

    private double currentValue = 0.0;
    ]  /*
   Creates the character and initializes named operator
    */

    private char operator = '+';

    /*
    creates an overided method for the add method from the BasicMath interface with the generic value N pass to it
     */
    @Override
    public <N extends Number> void add(N value){
        operator = '+';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }

    @Override
    public <N extends Number> void subtract(N value){
        operator = '-';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue -= inputValue;
        updateDisplay();
    }

    @Override
    public <N extends Number> void multiply(N value){
    operator = '*';
    previousValue = currentValue;
    this.inputValue = value.doubleValue();
    currentValue *= inputValue;
    updateDisplay();
    }

    @Override
    public <N extends Number> void divide(N value){
        operator = '/';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue /= inputValue;
        updateDisplay();
    }

    public void updateDisplay(){
        System.out.println();
        System.out.printf(" %,12.2f%n", previousValue);
        System.out.printf("%1s%,12.2f%n", operator, inputValue);
        System.out.println("===========");
        System.out.printf("%,12.2f%n", currentValue);
        System.out.println();
    }
}
