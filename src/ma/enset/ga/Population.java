package ma.enset.ga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Population {
    Random rnd = new Random();
    List<Individual> individuals = new ArrayList<>();
    Individual firstFitness ;
    Individual seconditness ;
    public void initializePopulation(){
        for(int i =0 ; i<20; i++){
            individuals.add(new Individual());
        }
    }
    public void calculateInFitness(){
        for(int i =0 ; i<20 ; i++){
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
        Individual individual1=new Individual();
        Individual individual2=new Individual();
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
          int index = rnd.nextInt(6);
          if(individuals.get(individuals.size()-2).getGenes()[index] == 1){
                   individuals.get(individuals.size()-2).getGenes()[index]=0;
          }else {
              individuals.get(individuals.size()-2).getGenes()[index]=1;
          }
          index=rnd.nextInt(6);
        if(individuals.get(individuals.size()-1).getGenes()[index] == 1){
            individuals.get(individuals.size()-1).getGenes()[index]=0;
        }else {
            individuals.get(individuals.size()-1).getGenes()[index]=1;
        }
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }
    public void sortPopulation(){
        Collections.sort(individuals , Collections.reverseOrder());
    }
    public  Individual getBestFitnessIndividual(){
        return individuals.get(0);
    }

}
