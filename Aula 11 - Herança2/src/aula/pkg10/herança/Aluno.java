package aula.pkg10.herança;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Método principal
    public void cancelarMatricula(){
        this.setMatricula(0);
        this.setCurso("Cancelado");
        System.out.println("Matricula cancelada com sucesso");
    }
    
    public void pagarMensalidade(){
        System.out.println("pagando mensalidade do aluno " + this.getNome());
    }
    
    public void status() {
        System.out.println("----------ALUNO----------" + "\nPessoa: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso());
    }
    
    //Métodos especiais
    public Aluno(String n, int i, String s, int m, String c){
        super(n, i, s);
        this.setMatricula(m);
        this.setCurso(c);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
