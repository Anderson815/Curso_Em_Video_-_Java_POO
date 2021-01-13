package aula.pkg10.herança;
public class Professor extends Pessoa{
    //Atributos
    private String especializacao;
    private float salario;
    
    //Métodos principais
    public void receberAumento(float a){
        this.setSalario(this.getSalario() + a);
        System.out.println("Seu salio é " + this.getSalario());
    }
    
    //Métodos especiais
    public Professor(String n, int i, String s, String e, float sa){
        super(n, i, s);
        this.setEspecializacao(e);
        this.setSalario(sa);
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
