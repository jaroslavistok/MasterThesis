package neural_net_components;

import org.junit.jupiter.api.Test;
import neural_net_components.ArtificialNeuron;
import summing_functions.WeightedSummingFunction;
import activation_functions.SigmoidActivationFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialNeuronTest {

    @Test
    public void creatingArtificialNeuron() throws Exception {
        ArtificialNeuron artificialNeuron = new ArtificialNeuron.NeuronBuilder(new WeightedSummingFunction(), new SigmoidActivationFunction()).neuronID(1).build();

        assertEquals(artificialNeuron.getNeuronId(), 1);
    }
}


