package aula.pkg10.herança;
public class Tecnico extends Aluno{
    //Atributos
    private int registroProfissional;
    
    //Métodos principais
    public void praticar(){
        System.out.println("Praticando .....");
    }
    
    @Override
    public void status(){
        System.out.println("----------TECNICO----------" + "\nPessoa: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso() + "\nRegistro Profissional: " + this.getRegistroProfissional());
    }
    
    //Métodos especiais
    public Tecnico(String n, int i, String s, int m, String c, int r){
        super(n, i, s, m, c);
        this.registroProfissional = r;
    }
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
