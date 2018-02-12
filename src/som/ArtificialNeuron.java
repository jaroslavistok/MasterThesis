package som;

public class ArtificialNeuron {

    private int neuronID;
    private InputSummingFunction summingFunction;
    private ActivationFunction activationFunction;

    public static class NeuronBuilder {
        private InputSummingFunction inputSummingFunction;
        private ActivationFunction activationFunction;

        private int neuronID;

        public NeuronBuilder(InputSummingFunction inputSummingFunction, ActivationFunction activationFunction) {
            this.inputSummingFunction = inputSummingFunction;
            this.activationFunction = activationFunction;
        }

        public NeuronBuilder neuronID(int id){
            this.neuronID = id;
            return this;
        }

        public ArtificialNeuron build(){
            return new ArtificialNeuron(this);
        }
    }

    private ArtificialNeuron(NeuronBuilder neuronBuilder){
        this.activationFunction = neuronBuilder.activationFunction;
        this.summingFunction = neuronBuilder.inputSummingFunction;
        this.neuronID = neuronBuilder.neuronID;
    }

}
