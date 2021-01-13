package aula.pkg10.herança;
public class Visitante extends Pessoa {
    //contyrutor
    public Visitante(String n, int i, String s){
        super(n, i, s);
    }
    
    public void status() {
        System.out.println("++++++++++VISITANTE+++++++++"+ "\nPessoa: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo());
    }
}
