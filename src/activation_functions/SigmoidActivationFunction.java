package activation_functions;

public class SigmoidActivationFunction implements ActivationFunction {
    @Override
    public double calculate(double value) {
        return Math.exp(value) / (Math.exp(value) + 1);
    }
}
