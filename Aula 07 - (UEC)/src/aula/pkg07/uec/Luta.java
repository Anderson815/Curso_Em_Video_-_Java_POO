package aula.pkg07.uec;

import java.util.Random;

public class Luta {
   //Atributos
   private Lutador desafiante;
   private Lutador desafiado;
   private int rounds = 3;
   private boolean aprovado;
   
   //Méwtodos principais
   
   public void marcarLuta(Lutador desafiante, Lutador desafiado){
       if(desafiante.categoria.equals(desafiado.categoria) && desafiante != desafiado){
           this.setAprovado(true);
           this.setDesafiante(desafiante);
           this.setDesafiado(desafiado);
       }
       else{
           this.setAprovado(false);
           this.setDesafiante(null);
           this.setDesafiado(null);
       }
   }
   
    public void lutar(Lutador desafiante, Lutador desafiado){
        this.marcarLuta(desafiante, desafiado);
        if(this.getAprovado()){
            System.out.println("!!!!! DESAFIANTE !!!!!");
            this.desafiante.apresentar();
            System.out.println("!!!!! DESAFIADO !!!!!");
            this.desafiado.apresentar();
           
            int d1 = 0;
            int d2 = 0;
            int a = 0;
            Random aleatorio = new Random();
            
            for(int contador = 0; contador < this.getRounds(); contador++){                
                a = aleatorio.nextInt(2);                
                switch(a){
                    case 0:
                        d1++;
                        break;
                    case 1:
                        d2++;
                        break;    
                }
            }
            
            if(d1 > d2){
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("#### O ganhador é " + this.desafiante.getNome());
            }else{
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();
                System.out.println("#### O ganhador é " + this.desafiado.getNome());
            }
        }
        else{
           System.out.println("A luta não pode ser realizada");
        }
    }
   
   //Métodos especiais
   
   
   public void setDesafiante(Lutador d){
       this.desafiante = d;
   }
   
   public Lutador getDesafiante(){
       return this.desafiante;
   }
   
   public void setDesafiado(Lutador d){
       this.desafiado = d;
   }
   
   public Lutador getDesafiado(){
       return this.desafiado;
   }
   
   public void setRounds(int r){
       this.rounds = r;
   }
   
   public int getRounds(){
       return this.rounds;
   }
   
   public void setAprovado(boolean a){
       this.aprovado = a;
   }
   
   public boolean getAprovado(){
       return this.aprovado;
   }
}
