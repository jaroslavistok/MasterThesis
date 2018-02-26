import neural_net_components.ArtificialNeuron;
import summing_functions.WeightedSummingFunction;
import activation_functions.SigmoidActivationFunction;

public class Application {
    public static void main(String[] args) {

        ArtificialNeuron neuron =
                new ArtificialNeuron.NeuronBuilder(new WeightedSummingFunction(), new SigmoidActivationFunction())
                        .neuronID(12).build();
    }
}
