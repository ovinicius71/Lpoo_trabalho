package Personagens;
import Armas.ArmaMago;

// falta implementar a arma para o personagem ainda 

public class Mago extends Personagem{
    double saude;
    double dano;
    double destreza;
    ArmaMago arma;
    public Mago (double saude,double dano,double destreza,ArmaMago arma){
        
        super("Mago", saude,dano,destreza,arma);
    }
    
}
