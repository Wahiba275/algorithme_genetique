package ma.enset.gaV2;

import java.util.Random;

public class Individual2 {
    //chromosome
    private char genes[] = new char[12];
    public static final String TARGET="bonjour sdia";
    private int fitness ;

    public Individual2() {
        Random rnd = new Random();
        for(int i=0 ; i<genes.length ; i++){
            char c = (char) (rnd.nextInt(26) + 'a');
            genes[i]=c;
        }
    }
    public void calculateFitness(){
        fitness = 0;
            for (int i = 0; i < genes.length; i++) {
                if (genes[i] == TARGET.charAt(i)) {
                    fitness++;
                }
            }
    }
    public char[] getGenes() {
        return genes;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public void setGenes(char[] genes) {
        this.genes = genes;
    }
}
