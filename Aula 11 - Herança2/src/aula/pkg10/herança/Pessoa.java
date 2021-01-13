package aula.pkg10.herança;
public abstract class Pessoa{
    //Atributos
    private int idade;
    private String sexo, nome;
    
    //Métodos principais
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
        System.out.println(this.getNome() + " tem " + this.getIdade() + " anos");
    }

    public abstract void status();
    /*
    public void status() {
        System.out.println("Pessoa: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo());
    }
    */
    
    //Métodos especiais
    public Pessoa (String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
