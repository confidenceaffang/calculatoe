/*
The generic Interface used to implement the Basic math
 */
public interface BasicMath {
    /*
    The add implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void add(N value );
    /*
    The subtract implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void subtract(N value );
    /*
    The multiply implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void multiply(N value );
    /*
    The divide implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void divide(N value );
}
