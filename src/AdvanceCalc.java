public class AdvanceCalc extends MemoryCalc  implements AdvanceMath{

    private int precision = 1;

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public void sqrt(){
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }
    public <N extends Number> void pow(N value){
        operator = '\u005E';
        previousValue = CurrentValue;
        inputValue =0.0;
        currentValue = Math.pow(inputValue, currentValue);
        updateDisplay();
    }


    @Override
    public void updateDisplay(){
        String format1 = " %,12." + precision + "f%n"; // used to jsut dipslay one value
        String format2 = "%1%,12." + precision + "f%n"; // used to display the operator plus the inputValue

        if(operator == '\u221A'){ // square root with no input value
            System.out.printf(format2, operator, previousValue);
        } else {
            System.out.printf(format1, previousValue);
            System.out.println(format2, operator, inputValue);
        }

        System.out.println("==============");
        System.out.printf(format1, currentValue);
        System.out.println();
    }
}

