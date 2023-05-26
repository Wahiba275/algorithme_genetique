package ma.enset.gaV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Population3 {
    Random rnd = new Random();
    List<Individual3> individuals = new ArrayList<>();
    Individual3 firstFitness ;
    Individual3 seconditness ;
    public void initializePopulation(){
        for(int i =0 ; i<GAUtils.POPULATION_SIZE; i++){
            individuals.add(new Individual3());
        }
    }
    public void calculateInFitness(){
        for(int i =0 ; i<GAUtils.POPULATION_SIZE ; i++){
            individuals.get(i).calculateFitness();
        }
    }
    public void selection(){
        firstFitness=individuals.get(0);
        seconditness=individuals.get(1);
    }
    public void crossover(){
        int pointCroisement = rnd.nextInt(5);
        pointCroisement++;
        Individual3 individual1=new Individual3();
        Individual3 individual2=new Individual3();
        for (int i=0 ; i<individual1.getGenes().length;i++) {
            individual1.getGenes()[i]=firstFitness.getGenes()[i];
            individual2.getGenes()[i]=seconditness.getGenes()[i];
        }
        for (int i=0 ; i<pointCroisement ; i++) {
            individual1.getGenes()[i]=seconditness.getGenes()[i];
            individual2.getGenes()[i]=firstFitness.getGenes()[i];
        }
        individuals.set(individuals.size()-2,individual1);
        individuals.set(individuals.size()-1,individual2);

    }

    public void mutation(){
        int index = rnd.nextInt(GAUtils.CHROMOSOME_SIZE );
        if(rnd.nextDouble()<GAUtils.MUTATION_PROBABILITY){
            individuals.get(individuals.size()-2).getGenes()[index]=GAUtils.CHARACTERS.charAt(rnd.nextInt(GAUtils.CHARACTERS.length()));
        }
        index = rnd.nextInt(GAUtils.CHROMOSOME_SIZE );
        if(rnd.nextDouble()<GAUtils.MUTATION_PROBABILITY){
            individuals.get(individuals.size()-1).getGenes()[index]=GAUtils.CHARACTERS.charAt(rnd.nextInt(GAUtils.CHARACTERS.length()));

        }
    }

    public List<Individual3> getIndividuals() {
        return individuals;
    }
    public void sortPopulation(){
        Collections.sort(individuals , Collections.reverseOrder());
    }
    public  Individual3 getBestFitnessIndividual(){
        return individuals.get(0);
    }

}
