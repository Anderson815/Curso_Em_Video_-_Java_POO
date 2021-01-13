package aula.pkg13.polimorfismo2;
public abstract class Animal {
    //Atributos
    protected String nome;
    protected int idade;
    protected int membros;
    
    //Métodos principais
    public abstract void emitirSom();
    
    //Métodos especiais
    public Animal(String n, int i, int m){
        this.nome = n;
        this.idade = i;
        this.membros = m;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
