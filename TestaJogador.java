public class TestaJogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.forca = 1;
        jogador1.nivel = 2;
        jogador1.pontos = 3;
        Jogador jogador2 = new Jogador();
        jogador2.forca = 10;
        jogador2.nivel = 20;
        jogador2.pontos = 30;

        System.out.println(jogador1.forca + " " + jogador1.nivel + " " + jogador1.pontos);
        System.out.println(jogador2.forca + " " + jogador2.nivel + " " + jogador2.pontos);


    }
}
