package aula.pkg14.projeto.pkgfinal;
public class Video implements AcoesVideo{
    // Atributos   
    private String titulo;
    private int avaliacao, view, curtidas;
    private boolean reproduzindo;
    
    // Métodos principais
    public String status(){
        String s = "----- VÍDEO -----" + "\nTítulo: " + this.getTitulo() +
                   "\nView: " + this.getView() + "\nCurtidas: " + this.getCurtidas() +
                   "\nAvaliação: " + this.getAvaliacao() + "\nReproduzindo: " + this.isReproduzindo();
        return s;
    }
    
    // Inteface
    @Override
    public void play(){
        this.setReproduzindo(true);
    }
    
    @Override
    public void pause(){
        this.setReproduzindo(false);
    }
    
    @Override
    public void like(){
        this.setAvaliacao(this.getAvaliacao() + 1);
    }
    
    // Métodos especiais
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.view = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.getAvaliacao() + avaliacao)/this.getView();
        this.avaliacao = nova;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
