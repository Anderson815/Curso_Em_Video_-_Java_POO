package aula.pkg12.polimorfismo1;
public class Ave extends Animal {
    // Atributos
    private String corPena;
    
    // Métodos principais
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construindo um ninho");
    }
    
    // Métodos especiais
    public Ave(int idade, float peso, int membros, String corPena){
        super(idade, peso, membros);
        this.corPena = corPena;
    }
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
