/*
 * This interface provides the code for using advance math calculations.
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */

/*
Basic Math implementation
 */
public interface BasicMath {
    /*
    The add implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void add(N value);

    /*
    The subtract implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void subtract(N value);

    /*
    The multiply implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void multiply(N value);

    /*
    The divide implementation taking in the Generic value (N) of the type Number
     */
    <N extends Number> void divide(N value);
}
