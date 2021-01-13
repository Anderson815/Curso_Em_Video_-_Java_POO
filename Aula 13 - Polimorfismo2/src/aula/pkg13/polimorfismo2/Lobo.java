package aula.pkg13.polimorfismo2;
public class Lobo extends Mamifero{
    //Métodos principais
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuu!");
    }
    
    //Métodos especiais
    public Lobo(String n, int i, int m, String c){
        super(n, i, m, c);
    }
}
