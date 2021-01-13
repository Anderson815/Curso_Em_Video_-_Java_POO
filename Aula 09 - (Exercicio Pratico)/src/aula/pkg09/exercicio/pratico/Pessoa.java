package aula.pkg09.exercicio.pratico;

public class Pessoa {
    //Pessoa
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos principais
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //Metodos especiais
    public Pessoa(String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    public String hetSexo(){
        return this.sexo;
    }
}
