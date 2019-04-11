package br.com.digitalhouse;

public class SuperHomem implements Voador {

    private String experiencia;

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        System.out.println("EXPERIENCIA = " + getExperiencia());
        System.out.println("ESTOU VOANDO COMO UM CAMPEÃO");
    }
}
