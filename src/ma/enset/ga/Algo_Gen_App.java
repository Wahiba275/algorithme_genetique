package ma.enset.ga;

import java.util.Arrays;
import java.util.Random;

public class Algo_Gen_App {
    private  static final int MAX_ITERATION = 100 ;
    private static final int MAX_FITNESS = 10;
    public static void main(String[] args) {
        Population population = new Population();
        population.initializePopulation();
        population.calculateInFitness();
        population.sortPopulation();
        System.out.println("chromosome : "+ Arrays.toString(population.getBestFitnessIndividual().getGenes())+ " fitness : "+population.getBestFitnessIndividual().getFitness());
        int it = 0;
    while (it < MAX_ITERATION && population.getBestFitnessIndividual().getFitness() < MAX_FITNESS){
        population.selection();
        population.crossover();
        Random rnd = new Random();
        if(rnd.nextInt(101) < 50){
            population.mutation();
        }
        population.calculateInFitness();
        population.sortPopulation();
        System.out.println("chromosome : "+ Arrays.toString(population.getBestFitnessIndividual().getGenes())+ " fitness : "+population.getBestFitnessIndividual().getFitness());
        it++;
    }

    }
}
