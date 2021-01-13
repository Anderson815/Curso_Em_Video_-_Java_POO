package aula.pkg09.exercicio.pratico;
public class Aula09ExercicioPratico {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Amanda", 17, "feminino");
        Livro l = new Livro("programação", "Anderson", 150, p);
        
        l.voltarPag();
        l.detalhes();
        l.folhear(150);
        l.detalhes();
        l.avancarPag();
        l.detalhes();
        p.fazerAniversario();
        l.detalhes();
    }
}
