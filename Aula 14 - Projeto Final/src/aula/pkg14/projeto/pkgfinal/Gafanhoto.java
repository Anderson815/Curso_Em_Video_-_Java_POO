package aula.pkg14.projeto.pkgfinal;
public class Gafanhoto extends Pessoa{
    // Atributos
    private String login;
    private int totassistido;
    
    // Métodos principais
    public void viuMaisUm(){
        this.setTotassistido(this.getTotassistido() + 1);
    }
    
    @Override
    public String status(){
        String s = super.status() + "\nLogin: " + this.getLogin() +
                   "\nTotal de vídeo assistido: " + this.getTotassistido();
        return s;
    }
    // Métodos especiais

    public Gafanhoto(String login, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totassistido = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
}
