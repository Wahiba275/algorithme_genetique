package ma.enset.gaV2;

import java.util.Arrays;
import java.util.Random;

import static ma.enset.gaV2.Population2.sortByFitness;

public class Algo_Gen_App2{
    private static final int MAX_ITERATION = 100;
    private static final int MAX_FITNESS = 12;

    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            Individual2 individual2 = new Individual2();
            individual2.calculateFitness();
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());

    System.out.println("*******befor crossover******");
    Population2 population2 = new Population2();
    population2.initializePopulation();
    population2.calculateFitness();
    sortByFitness(population2.individuals);
        for (Individual2 individual2 : population2.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());

        }
        System.out.println("affteeeer");
        population2.selection();
        population2.crossover();
        sortByFitness(population2.individuals);
        for (Individual2 individual2 : population2.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());

        }

        System.out.println("****after mutation**********");
        population2.mutation();
        for (Individual2 individual2 : population2.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());

        }*/
        Population2 population2 = new Population2();
        population2.initializePopulation();
        population2.calculateFitness();
        //sortByFitness(population2.individuals);
        System.out.println("chromosome : "+ Arrays.toString(population2.getBestFitnessIndividual().getGenes())+ " fitness : "+population2.getBestFitnessIndividual().getFitness());
        int it = 0;
        while (it < MAX_ITERATION && population2.getBestFitnessIndividual().getFitness() < MAX_FITNESS){
            population2.selection();
            population2.crossover();
            Random rnd = new Random();
            if(rnd.nextInt(101) < 70){
                population2.mutation();
            }
            population2.calculateFitness();
           // sortByFitness(population2.individuals);
            System.out.println("chromosome : "+ Arrays.toString(population2.getBestFitnessIndividual().getGenes())+ " fitness : "+population2.getBestFitnessIndividual().getFitness());
            it++;
        }

    }
}
