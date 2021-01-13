package aula.pkg10.herança;
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos principais
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
        System.out.println("Funcionário " + this.getNome() + " neste momento está trabalhando: " + this.isTrabalhando());
    }
    
    //Métodos especiais
    public Funcionario(String n, int i, String s, String se, boolean t){
        super(n, i, s);
        this.setSetor(se);
        this.setTrabalhando(t);
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
