package neural_net_components;

import java.util.ArrayList;
import java.util.List;

public class NetLayer {
    private int id;

    private List<ArtificialNeuron> neuronsInLayer;

    public NetLayer(int id){
        this.id = id;
        this.neuronsInLayer = new ArrayList<>();
    }
}
