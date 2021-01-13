package aula.pkg12.polimorfismo1;
public class Aula12Polimorfismo1 {
    public static void main(String[] args) {
        Ave a = new Ave(3, 30.5f, 4, "Vermelho");
        Peixe p = new Peixe(26, 15.3f, 1, "Azul");
        Reptil r = new Reptil(45, 105.78f, 4, "Verde");
        Mamifero m = new Mamifero(68, 80.5f, 4, "Amarelo");
        
        Cachorro cac = new Cachorro(8, 28.9f, 4, "Marrom");
        Canguru can = new Canguru(5, 120.0f, 4, "Amarelo");
           
        System.out.println("-----Locomover-----");
        a.locomover();
        p.locomover();
        r.locomover();
        m.locomover();
        
        System.out.println("-----Alimentar-----");
        a.alimentar();
        p.alimentar();
        r.alimentar();
        m.alimentar();
        
        System.out.println("-----Emitir Som-----");
        a.emitirSom();
        p.emitirSom();
        r.emitirSom();
        m.emitirSom();
        
        System.out.println("-----Especificos-----");
        a.fazerNinho();
        p.fazerBolha();

        System.out.println("-----Cacchorro e Canguru-----");
        cac.locomover();
        can.locomover();
        
        cac.emitirSom();
        can.emitirSom();
    }    
}
