package connections;

import neural_net_components.ArtificialNeuron;

public class NeuronConnection implements Connection {
    private ArtificialNeuron from;
    private ArtificialNeuron to;

    private double connectionWeight;


    public NeuronConnection(ArtificialNeuron from, ArtificialNeuron to, double weight){
        this.from = from;
        this.to = to;
        this.connectionWeight = weight;
    }

    public double getWeightedInput(){
        return from.calculateOutput() * connectionWeight;
    }

}
