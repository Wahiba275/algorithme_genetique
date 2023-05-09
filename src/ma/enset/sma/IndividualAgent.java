package ma.enset.sma;


import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.wrapper.AgentContainer;

import java.util.Random;

public class IndividualAgent extends Agent {
    Random rnd = new Random();
    private  int fitness ;
    private  int genes[] = new int[10];
    @Override
    protected void setup() {
        //Calculate fitness
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                fitness=0;
                for(int gene:genes){
                    fitness+=gene;
                }
            }
        });

        AgentContainer containerController = getContainerController();
        //containerController.createNewAgent("",);
        //Mutation
    addBehaviour(new OneShotBehaviour() {

        @Override
        public void action() {
            int index = rnd.nextInt(6);
            if(genes[index] == 1){
                genes[index]=0;
            }else {
                genes[index]=1;
            }
        }
    });
    }
}
