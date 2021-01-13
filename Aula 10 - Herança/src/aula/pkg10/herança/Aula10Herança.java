package aula.pkg10.herança;
public class Aula10Herança {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa("João", 20, "Masculino");
        Aluno a = new Aluno("Veronica", 19, "Feminino", 1234, "JAVA");
        Professor pr = new Professor("Anderson", 23, "Masculino", "P.O.O.", 8590);
        Funcionario f = new Funcionario("Amanda", 22, "Feminino", "Secretaria", true);
        
        f.mudarTrabalho();
        pr.receberAumento(7000.80f);       
        a.cancelarMatricula();
    }    
}
