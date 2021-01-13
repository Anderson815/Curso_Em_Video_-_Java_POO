package aula.pkg14.projeto.pkgfinal;
public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    // Métodos principais
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int nota = 0;
        
        if(porc <= 20){
            nota = 3;
        }else if(porc <= 50){
            nota = 5;
        }else if(porc <= 90){
            nota = 8;
        }else{
            nota = 10;
        }
        
       this.filme.setAvaliacao(nota);
    }
    
    // Métodos especiais
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotassistido(this.espectador.getTotassistido() + 1);
        this.filme.setView(this.filme.getView() + 1);
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}
