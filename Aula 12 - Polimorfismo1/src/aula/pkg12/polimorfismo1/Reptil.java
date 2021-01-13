package aula.pkg12.polimorfismo1;
public class Reptil extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos principais
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comer vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }     
    
    //Métodos especiais
    public Reptil(int idade, float peso, int membros ,String corEscama) {
        super(idade, peso, membros);
        this.corEscama = corEscama;
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
