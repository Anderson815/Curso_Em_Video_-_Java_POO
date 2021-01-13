package aula.pkg14.projeto.pkgfinal;
public class Aula14ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("P.O.O.");
        v[1] = new Video("JAVA");
        v[2] = new Video("MySQL");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("andersonCS", "Anderson", "M", 19);
        g[1] = new Gafanhoto("amandaAR", "Amanda", "F", 18);

        System.out.println(g[0].status());
        System.out.println(v[1].status());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]); // Assisti Java
        vis[0].avaliar();
        
        System.out.println(g[0].status());
        System.out.println(v[1].status()); 

        vis[1] = new Visualizacao(g[0], v[1]); // Assisti MySQL
        vis[1].avaliar(87.0f); // Avalia normal
        
        System.out.println(g[0].status());
        System.out.println(v[1].status());
        System.out.println(v[2].status());
        
        /*
        g[0].setLogin("ANDERSONcs");
        g[0].setNome("aNDERSON");
        g[0].setSexo("m");
        g[0].setIdade(119);
        g[0].setExperiencia(10.5f);
        g[0].setTotassistido(10000);
        
        v[1].setCurtidas(10);
        v[1].setView(100);
        v[1].setAvaliacao(5);
        v[1].setReproduzindo(true);
        
        System.out.println(g[0].status());
        System.out.println(v[1].status());
        */
    }
}
