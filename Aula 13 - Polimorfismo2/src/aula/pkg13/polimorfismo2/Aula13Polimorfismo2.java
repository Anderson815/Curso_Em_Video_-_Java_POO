package aula.pkg13.polimorfismo2;
public class Aula13Polimorfismo2 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero("Leão", 20, 4, "Laranja");
        Lobo l = new Lobo("Alpha", 15, 4, "Branco");
        Cachorro c = new Cachorro("Pitbull", 8, 4, "Preto");
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        /*
        System.out.println("-----Reagir-----");
        c.reagir("Olá");
        c.reagir(19, 15);
        c.reagir(true);
        c.reagir(9, 8f); 
        */
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(20, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
