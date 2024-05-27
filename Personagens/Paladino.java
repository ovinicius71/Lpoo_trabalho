package Personagens;
import Armas.ArmaPaladino;

// falta implementar a arma para o personagem ainda 

public class Paladino extends Personagem {
    double saude;
    double dano;
    double destreza;
    ArmaPaladino arma; 
    public Paladino (double saude,double forca,double destreza,ArmaPaladino arma ){
        super("Paladino",saude,forca,destreza,arma );
    }
    
}
