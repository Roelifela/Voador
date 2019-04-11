package br.com.digitalhouse;

public class Pato implements Voador{

    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        System.out.println("ENERGIA = " + getEnergia());
        System.out.println("ESTOU VOANDO COMO UM PATO");
    }
}
