package ma.enset.gaV3;
import java.util.Arrays;
import java.util.Random;


public class App3 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            Individual2 individual2 = new Individual2();
            individual2.calculateFitness();
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());
    System.out.println("*******befor crossover******");
    Population2 population3 = new Population2();
    population3.initializePopulation();
    population3.calculateFitness();
    sortByFitness(population3.individuals);
        for (Individual2 individual2 : population3.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());
        }
        System.out.println("affteeeer");
        population3.selection();
        population3.crossover();
        sortByFitness(population3.individuals);
        for (Individual2 individual2 : population3.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());
        }
        System.out.println("****after mutation**********");
        population3.mutation();
        for (Individual2 individual2 : population3.individuals) {
            System.out.println("chromosome: "+Arrays.toString(individual2.getGenes())+ " fitness : "+individual2.getFitness());
        }*/
        Population3 population3 = new Population3();
        population3.initializePopulation();
        population3.calculateInFitness();
        //sortByFitness(population3.individuals);
        System.out.println("chromosome : "+ Arrays.toString(population3.getBestFitnessIndividual().getGenes())+ " fitness : "+population3.getBestFitnessIndividual().getFitness());
        int it = 0;
        while (it < GAUtils.MAX_ITERATION && population3.getBestFitnessIndividual().getFitness() < GAUtils.CHROMOSOME_SIZE){
            population3.selection();
            population3.crossover();
            Random rnd = new Random();
            if(rnd.nextInt(101) < 70){
                population3.mutation();
            }
            population3.calculateInFitness();
            // sortByFitness(population3.individuals);
            System.out.println("chromosome : "+ Arrays.toString(population3.getBestFitnessIndividual().getGenes())+ " fitness : "+population3.getBestFitnessIndividual().getFitness());
            it++;
        }
            }
        }


