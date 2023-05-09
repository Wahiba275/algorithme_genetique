package ma.enset.sma;

import jade.core.AID;
import jade.core.Agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GAPopulation extends Agent {
    List<IndividualAgent> individuals = new ArrayList<>();
    Map<AID, Integer> agentFitness = new HashMap<>();
    @Override
    protected void setup() {

    }
}
