/*
Memory class which is a subclass or derived class from Calculator
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
    public void memoryClear(){
        this.memoryValue = 0.0;
    }

    /*
    a method that subtract 1 from the current memory value
     */
    public void memorySubtract(){
        this.memoryValue -= 1.0;
    }

    /*
    a method that returns the current memory value
     */
    public double getMemoryValue() {
        return this.memoryValue;
    }

    /*
 a method that adds 1 from the current memory value
  */
    public void memoryAdd(){
        this.memoryValue += 1.0;
    }

    /*
 a method that clears the current memory value by reassigning it to zero similar to the memoryClear method
  */
    public void clear(){
        this.memoryValue = 0.0;
    }
}
