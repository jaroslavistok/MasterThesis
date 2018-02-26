package summing_functions;

import connections.Connection;

import java.util.List;

public class WeightedSummingFunction implements InputSummingFunction {
    @Override
    public double calculate(List<Connection> connectionList) {
        double weightedSum = 0d;

        for (Connection connection : connectionList) {
            weightedSum += connection.getWeightedInput();
        }

        return weightedSum;
    }
}
