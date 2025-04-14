/**
 *This interface provides the code for using advance math calculations.
 *
 *
 * @author Confidence Affang , Ricardo Pretorius
 * @version 1.0
 * @since 2025.04.11
 * @see <a href="https://github.com/confidenceaffang/CalculatorApp">GitHub Repository</a>
 * @see <a href="https://github.com/confidenceaffang">Confidence Affang's GitHub</a>
 * @see <a href="https://github.com/RicardoPret">Ricardo Pretorius GitHub</a>
 *
 */
public interface AdvanceMath {

    /**
     * The power implementation taking in the Generic value (N) of the type Number
     *
     * @param value the exponent to raise the current value to
     * @param <N> the type of the exponent, which extends Number
     */
    <N extends Number> void pow(N value );

    /**
     * The square root implementation method
     */
    void sqrt();
}
