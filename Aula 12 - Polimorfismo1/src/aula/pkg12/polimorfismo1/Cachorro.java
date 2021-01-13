package aula.pkg12.polimorfismo1;
public class Cachorro extends Mamifero{
    //Métodos principais
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso !!!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
    //Métodos especiais
    public Cachorro(int idade, float peso, int membros, String corPelo) {
        super(idade, peso, membros, corPelo);
    }    
}
