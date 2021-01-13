package aula.pkg12.polimorfismo1;
public abstract class Animal{
    //Atributos
    private float peso;
    private int idade, membros;
    
    //Métodos principais
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
    //Métodos especiais 
    public Animal(int idade, float peso, int membros){
        this.idade = idade;
        this.peso = peso;
        this.membros = membros;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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
