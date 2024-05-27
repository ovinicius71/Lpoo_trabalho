package Armas;

public abstract class Arma {
    
    private String nome;
    private double modDano;

    public Arma (String nome, double modificador){
        this.nome = nome;
        this.modDano = modificador;
    }
    public String getNome(){
        return nome;
    }
    public double getModificadorDano(){
        return modDano;
    }
}
