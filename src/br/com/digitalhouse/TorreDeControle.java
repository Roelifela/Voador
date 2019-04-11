package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    List<Voador> voadores = new ArrayList<>();

    public void voemTodos() {

        for (Voador voador : voadores) {
            voador.voar();
        }

    }

    public void adicionarVoador(Voador voador) {
        voadores.add(voador);

    }


}
