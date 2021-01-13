package aula.pkg12.polimorfismo1;
public class Mamifero extends Animal{
    //Atributos
    private String corPelo;
    
    //Métodos principais
    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }     
    
    //Métodos especiais
    public Mamifero(int idade, float peso, int membros ,String corPelo) {
        super(idade, peso, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
   
}
