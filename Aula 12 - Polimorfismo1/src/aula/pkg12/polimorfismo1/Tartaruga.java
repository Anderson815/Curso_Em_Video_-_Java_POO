package aula.pkg12.polimorfismo1;
public class Tartaruga extends Reptil {
    //Métodos principais
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    
    //Métodos epeciais
    public Tartaruga(int idade, float peso, int membros, String corEscama) {
        super(idade, peso, membros, corEscama);
    }
    
}
