package aula.pkg14.projeto.pkgfinal;
public abstract class Pessoa {
    // Atributos
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;
    
    // Métodos principais
    protected void ganharExp(){
        this.setExperiencia(this.getExperiencia() + 1);
    }

    public String status(){        
        String s = "----- GAFANHOTO -----" + "\nNome: " + this.getNome() +
                   "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() +
                   "\nExperiência: " + this.getExperiencia();
        
        return s;
    }
    
    // Métodos especiais
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
}
