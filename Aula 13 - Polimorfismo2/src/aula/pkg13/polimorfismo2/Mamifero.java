package aula.pkg13.polimorfismo2;
public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    
    //Métodos principais
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }
    
    //Métodos especiais
    public Mamifero(String n, int i, int m, String c){
        super(n, i, m);
        this.corPelo = c;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
