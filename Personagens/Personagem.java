package Personagens;

import Armas.Arma;

//falta implementar a recebe dano, tem que perguntar pois nao vi utilidade

public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;
    
    public Personagem (String nomeTipo, double saude, double forca, double destreza,Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;

    }
    
    public printStatus(){
        System.out.printf("Saude: %2f, Forca: %2f, Destreza: %2f, %s ", this.saude,this.forca,this.destreza,this.arma.getNome());
    }
    public atacar (Personagem b){
        if (this.forca > b.forca && this.destreza > b.destreza ){
            double dano = calculaDano();
            b.saude = b.saude - (dano * b.saude);
        }
        else if (this.forca == b.forca && this.destreza == b.destreza){
            System.out.println("Nada aconteceu");
        }
        else {
            double dano = b.calculaDano();
            this.saude = this.saude - (dano * this.saude);
        }
    }
    private double calculaDano (){
        return (this.arma.getModificadorDano());

    }
    private recebeDano(double pontosDano){

    }
    private boolean estaMorto (){
        if (this.saude < 1){
            return true;
        }
        else {
            return false;
        }
    }
}
