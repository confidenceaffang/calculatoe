public class Testbench{
    public static void main(String[] args){


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