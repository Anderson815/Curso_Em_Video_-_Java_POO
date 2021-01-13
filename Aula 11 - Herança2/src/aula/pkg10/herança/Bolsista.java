package aula.pkg10.herança;
public class Bolsista extends Aluno{
    //Atributos
    private int bolsa;
    
    //Métodos principais
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do bolsista " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! pagamento foi realizado");
    }
    
    @Override
    public void status(){
        System.out.println("----------BOLSISTA----------" + "\nPessoa: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso() + "\nBolsa: " + this.getBolsa());
    }
    
    //Métodos especiais
    public Bolsista(String n, int i, String s, int m, String c, int b){
        super(n, i, s, m, c);
        this.bolsa = b;
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
