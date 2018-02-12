import org.junit.jupiter.api.Test;
import som.ArtificialNeuron;
import som.BasicSummingFunction;
import som.SigmoidActivationFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialNeuronTest {

    @Test
    public void creatingArtificialNeuron() throws Exception {
        ArtificialNeuron artificialNeuron = new ArtificialNeuron.NeuronBuilder(new BasicSummingFunction(), new SigmoidActivationFunction()).neuronID(1).build();
        assertEquals(artificialNeuron.getNeuronId(), 1);
    }
}
