package br.com.digitalhouse;

public class Aviao implements Voador {

    private int horasDeVoo;

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {
        System.out.println("HORAS DE VOO = " + getHorasDeVoo());
        System.out.println("ESTOU VOANDO COMO UM AVIÃO");
    }
}
