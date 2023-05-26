package ma.enset.gaV2;



import ma.enset.gaV3.Individual3;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class Population2 {
    Random rnd = new Random();
    List<Individual2> individuals = new ArrayList<>();
    Individual2 firstFitness;
    Individual2 secondFitness;
    public void initializePopulation() {
        for (int i = 0; i < 20; i++) {
            individuals.add(new Individual2());
        }
    }

    public void calculateFitness(){
        for (int i = 0; i < 20 ; i++) {
            individuals.get(i).calculateFitness();
        }
    }
    public void selection(){
        firstFitness = individuals.get(0);
        secondFitness =individuals.get(1);
    }

    public  void crossover() {
        int length = firstFitness.getGenes().length;
        int crossoverPoint = (int) (Math.random() * (length - 1)) + 1; // point de crossover aléatoire
        // récupérer les gènes des parents
        char[] genes1 = firstFitness.getGenes();
        char[] genes2 = firstFitness.getGenes();
        // effectuer le crossover
        for (int i = crossoverPoint; i < length; i++) {
            char temp = genes1[i];
            genes1[i] = genes2[i];
            genes2[i] = temp;
        }
        // mettre à jour les gènes des parents avec les nouveaux gènes
        firstFitness.setGenes(genes1);
        secondFitness.setGenes(genes2);
    }

    public void mutation() {
        String TARGET = "bonjour sdia";
        int index = rnd.nextInt(TARGET.length());
        char[] genes1 = firstFitness.getGenes();
        genes1[index] = TARGET.charAt(index);
        firstFitness.setGenes(genes1);
        char[] genes2 = secondFitness.getGenes();
        genes2[index] = TARGET.charAt(index);
        secondFitness.setGenes(genes2);
    }

    public static void sortByFitness(List<Individual3> population) {
        population.sort((a, b) -> Double.compare(b.getFitness(), a.getFitness()));
    }

    public Individual2 getBestFitnessIndividual(){
        return individuals.get(0);
    }
}


