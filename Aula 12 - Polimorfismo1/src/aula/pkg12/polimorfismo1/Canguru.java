package aula.pkg12.polimorfismo1;
public class Canguru extends Mamifero{
    //Métodos Principais
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
    //Métodos especiais 
    public Canguru(int idade, float peso, int membros, String corPelo) {
        super(idade, peso, membros, corPelo);
    }
}
