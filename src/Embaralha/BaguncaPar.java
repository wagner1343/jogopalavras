package Embaralha;

import java.util.ArrayList;
import trabalhopoo.Jogo;

public class BaguncaPar implements Jogo {

    private String palavra;
    private String palavraPronta = "";
    private char primeira;
    String ok = "";

    public void Muda(String palavra) {

        this.palavra = palavra;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho; i = i + 2) {
            if (i % 2 == 0) {
                primeira = palavra.charAt(i);
                palavraPronta += primeira;
            }
            i--;
            if (i % 2 == 1) {
                primeira = palavra.charAt(i);
                palavraPronta += primeira;
            }
            if (i == tamanho) {
                palavraPronta += palavra.charAt(i);
            }
            i++;
        }
        
        ok = palavraPronta;
        System.out.println(ok);
        System.out.println("bagunca");

    }

    public String getPalavra() {
        return "saida " + ok;
    }

}
