package aula.pkg12.polimorfismo1;
public class Peixe extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos principais
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }    
    
    public void fazerBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    //Métodos especiais
    public Peixe(int idade, float peso, int membros ,String corEscama) {
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
