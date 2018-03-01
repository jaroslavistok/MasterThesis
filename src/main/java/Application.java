import neural_net_components.ArtificialNeuron;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import summing_functions.WeightedSummingFunction;
import activation_functions.SigmoidActivationFunction;

public class Application {
    public static void main(String[] args) {

//        ArtificialNeuron neuron =
//                new ArtificialNeuron.NeuronBuilder(new WeightedSummingFunction(), new SigmoidActivationFunction())
//                        .neuronID(12).build();


        INDArray nd = Nd4j.create(new float[]{1,2},new int[]{2}); //row vector
        INDArray nd2 = Nd4j.create(new float[]{3,4},new int[]{2, 1}); //column vector
        nd.mmul(nd2);

        System.out.println("Generated Random Number: " + nd);
    }
}
