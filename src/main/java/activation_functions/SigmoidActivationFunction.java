package activation_functions;

public class SigmoidActivationFunction implements ActivationFunction {

    private double threshold;

    public SigmoidActivationFunction(){
        this.threshold = 0;
    }

    public void setThreshold(double threshold){
        this.threshold = threshold;
    }

    @Override
    public double calculate(double value) {
        return Math.exp(value) / (Math.exp(value) + 1);
    }
}
