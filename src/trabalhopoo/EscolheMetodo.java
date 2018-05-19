/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import java.util.Random;

public class EscolheMetodo {

    public void Escolhe(String palavra) {
        Random rand = new Random();

        int num = rand.nextInt(3);
        Inverte inverte = new Inverte();
        EmbaralhaLista lista = new EmbaralhaLista();
        BaguncaPar bagunca = new BaguncaPar();

        if (num == 1) {
            inverte.Muda(palavra);
            inverte.getPalavra();
        }
        if (num == 2) {
            lista.Muda(palavra);
            lista.getPalavra();

        }
        if (num == 3) {
            bagunca.Muda(palavra);
            bagunca.getPalavra();
        }

    }
}
