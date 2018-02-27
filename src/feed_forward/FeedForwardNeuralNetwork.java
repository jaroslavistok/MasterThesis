package feed_forward;

import neural_net_components.NetLayer;

import java.util.List;

public class FeedForwardNeuralNetwork implements NeuralNetwork {
    private int id;
    private NetLayer inputLayer;
    private List<NetLayer> hiddenLayers;
    private NetLayer outputLayer;
}
