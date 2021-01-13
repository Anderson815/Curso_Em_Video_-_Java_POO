package aula.pkg10.herança;
public class Aula10Herança {
    public static void main(String[] args) {
        Visitante v = new Visitante("João", 20, "Masculino");
        Aluno a = new Aluno("Veronica", 19, "Feminino", 1234, "JAVA");
        Bolsista b = new Bolsista("João", 25, "Masculino", 11111, "P.O.O.", 50);
        Professor pr = new Professor("Anderson", 23, "Masculino", "JavaScript", 8590);
        Tecnico t = new Tecnico("Creiton", 23, "Masculino", 12121, "MySQL", 99999);
        
        //alunos
        a.status();
        b.status();
        t.status();
        
        //subclasses de pessoa
        a.status();
        pr.status();
        v.status();
        
        /*
        pe.fazerAniversario();
        pr.receberAumento(7000.80f);
        a.pagarMensalidade();
        b.pagarMensalidade();
        t.praticar();
        a.cancelarMatricula();
        t.cancelarMatricula();
        */
    }    
}
