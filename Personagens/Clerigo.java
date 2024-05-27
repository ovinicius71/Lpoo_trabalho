package Personagens;
import Armas.ArmaClerigo;

// falta implementar a arma para o personagem ainda 

public class Clerigo extends Personagem {
    double saude;
    double dano;
    double destreza;
    ArmaClerigo arma; 
    public Clerigo (double saude,double dano,double destreza, ArmaClerigo arma){

        super("Clerigo", saude, dano, destreza, arma);
    }
}
