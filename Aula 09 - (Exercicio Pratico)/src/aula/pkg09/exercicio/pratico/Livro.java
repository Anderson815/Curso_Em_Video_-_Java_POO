package aula.pkg09.exercicio.pratico;
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos principais
    public void detalhes(){
        System.out.println("----- DETALHES -----");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Idade do leitor: " + this.leitor.getIdade());
        System.out.println("Total de página: " + this.getTotPagina());
        System.out.println("Está aberto: " + this.getAberto());
        if(this.getAberto()){
            System.out.println("pagina atual: " + this.getPagAtual());      
        }else{
            System.out.println("pagina atual: 0");
        }  
    }

    //Métodos da interface
        @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > 0 && p <= this.getTotPagina()){
            this.setPagAtual(p);           
            System.out.println("Livro folheado");
        }else{
            System.out.println("Página inexistente");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() < this.getTotPagina()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("Não da para avançar");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() > 2){
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            System.out.println("Não da para voltar");
        }        
    }

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.leitor = leitor;
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    //Métodos especiais
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setTotPagina(int tp){
        this.totPagina = tp;
    }
    
    public int getTotPagina(){
        return this.totPagina;
    }
    
    public void setPagAtual(int pa){
        if(pa > 0 && pa <= this.getTotPagina()){
            this.pagAtual = pa;
        }else{
            System.out.println("Pagina inexistente");
        }
    }
    
    public int getPagAtual(){
        return this.pagAtual;
    }
    
    public void setAberto(boolean a){
        this.aberto = a;
    }
    
    public boolean getAberto(){
        return this.aberto;
    }
    
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    
    public Pessoa getLeitor(){
        return this.leitor;
    }
        
}
