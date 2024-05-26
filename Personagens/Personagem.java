package Personagens;

import Armas.Arma;


public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;
    
    public Personagem (String nomeTipo, double saude, double forca, double destreza,Arma arma){

    }
    
    public printStatus(){

    }
    public atacar (Personagem b){

    }
    private double calculaDano (){

    }
    private recebeDano(double pontosDano){

    }
    private boolean estaMorto (){}
}
