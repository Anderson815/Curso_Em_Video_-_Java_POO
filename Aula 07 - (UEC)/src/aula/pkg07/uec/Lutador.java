package aula.pkg07.uec;
public class Lutador {
   //Atributos 
   String nome, nacionalidade, categoria;
   int idade, vitorias, derrotas, empates;
   float altura, peso;
   
   //Métodos Principais
   public void apresentar(){
       System.out.println("----- APRESENTAÇÃO -----");
       System.out.println("NOME: " + this.getNome());
       System.out.println("NACIONALIDADE: " + this.getNacionalidade());
       System.out.println("IDADE: " + this.getIdade());
       System.out.println("ALTURA: " + this.getAltura());
       System.out.println("PESO: " + this.getPeso());
       System.out.println("CATEGORIA: " + this.getCategoria());
       System.out.println("VITORIAS: " + this.getVitorias());
       System.out.println("DERROTAS: " + this.getDerrotas());
       System.out.println("EMPATES: " + this.getEmpates());
   }
   
   public void status(){
       System.out.println("----- STATUS -----");
       System.out.println("VITORIAS: " + this.getVitorias());
       System.out.println("DERROTAS: " + this.getDerrotas());
       System.out.println("EMPATES: " + this.getEmpates());
   }
   
   public void ganharLuta(){
       this.setVitorias(this.getVitorias() + 1);
   }
   
   public void perderLuta(){
       this.setDerrotas(this.getDerrotas() + 1);
   }
   
   public void empatarLuta(){
       this.setEmpates(this.getEmpates() + 1);
   }
   
   //Métodos Especiais
   public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
       this.nome = nome;
       this.nacionalidade = nacionalidade;
       this.idade = idade;
       this.altura = altura;
       this.setPeso(peso);
       this.vitorias = vitorias;
       this.derrotas = derrotas;
       this.empates = empates;
   }
   
   public void setNome(String n){
       this.nome = n;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public void setNacionalidade(String n){
       this.nacionalidade = n;
   }
 
   public String getNacionalidade(){
       return this.nacionalidade;
   }
   
   public void setIdade(int i){
       this.idade = i;
   }
   
   public int getIdade(){
       return this.idade;
   }
   
   public void setAltura(float a){
       this.altura = a;
   }
   
   public float getAltura(){
       return this.altura;
   }
   
   public void setPeso(float p){
       this.peso = p;
       this.setCategoria();
   }
   
   public float getPeso(){
       return this.peso;
   }
   
   private void setCategoria(){
       if(this.getPeso() < 50.2f){
           this.categoria = "Inválido";
       }
       else if(this.getPeso() <= 70.3f){
           this.categoria = "leve";
       }
       else if(this.getPeso() <= 83.9f){
           this.categoria = "Médio";
       }
       else if(this.getPeso() <= 120.2f){
           this.categoria = "Pesado";
       }
       else{
           this.categoria = "Inválido";
       }
       
   }
   
   public String getCategoria(){
        return this.categoria;
   }
   
   public void setVitorias(int v){
       this.vitorias = v;
   }
   
   public int getVitorias(){
       return this.vitorias;
   }
   
   public void setDerrotas(int d){
       this.derrotas = d;
   }
   
   public int getDerrotas(){
       return this.derrotas;
   }
   
   public void setEmpates(int e){
       this.empates = e;
   }
   
   public int getEmpates(){
       return this.empates;
   }
}
