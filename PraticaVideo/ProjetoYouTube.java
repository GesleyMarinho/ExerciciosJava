package PraticaVideo;

public class ProjetoYouTube {
    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 0");
        v[1] = new Video("Aula 1");
        v[2] = new Video("Aula 3");

        System.out.println("VIDEO");
        System.out.println(v[0].toString());
        System.out.println("=========================");
        System.out.println("Gafanhotos");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Gesley", 30, "M", "Ges");
        g[1] = new Gafanhoto("Dumar", 22, "M", "Du");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("=========================");
        System.out.println("Visualização");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[1],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[1],v[1]);
        vis[0].avaliar(35);
        System.out.println(vis[1].toString());


    }
}
