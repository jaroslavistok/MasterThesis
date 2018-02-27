package neural_net_components;

import activation_functions.ActivationFunction;
import connections.Connection;
import summing_functions.InputSummingFunction;

import java.util.ArrayList;
import java.util.List;

public class ArtificialNeuron {

    private int neuronID;

    private List<Connection> inputConnections;
    private List<Connection> outputConnections;

    private InputSummingFunction inputSummingFunction;
    private ActivationFunction activationFunction;

    public int getNeuronId() {
        return this.neuronID;
    }


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
        this.inputSummingFunction = neuronBuilder.inputSummingFunction;
        this.neuronID = neuronBuilder.neuronID;

        this.inputConnections = new ArrayList<>();
        this.outputConnections = new ArrayList<>();
    }

    public double calculateOutput(){
        double totalInput = inputSummingFunction.calculateSum(inputConnections);
        return activationFunction.calculate(totalInput);
    }

}
