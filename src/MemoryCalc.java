public class MemoryCalc extends Calculator {

    private static double memoryValue = 0.0;

    public void displayMemoryValue() {
        System.out.println("Memory Value: " + memoryValue);
    }

    public void memoryClear(){
        this.memoryValue = 0.0;
    }

    public void memorySubtract(){
        this.memoryValue -= 1.0;
    }
    public double getMemoryValue() {
        return this.memoryValue;
    }

    public void memoryAdd(){
        this.memoryValue += 1.0;
    }
}
