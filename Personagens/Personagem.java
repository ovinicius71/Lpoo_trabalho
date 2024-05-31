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
    
    public void printStatus(){
        if (estaMorto()){
            System.out.println(nomeTipo + " [Morreu, Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        }
        else{
            System.out.println(nomeTipo + " [Saude: " + saude + ", Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        }
    }
    public void atacar (Personagem b){
        if (estaMorto()){
            System.out.println("O " + nomeTipo + " não consegue atacar, pois está morto.");
            return;
        }

        System.out.println("O " + nomeTipo + " ataca o " + b.nomeTipo + " com " + arma.getNome() + ".");

        if (b.estaMorto()) {
            System.out.println("Pare! O " + b.nomeTipo + " já está morto!");
            return;
        }

        if (this.forca > b.forca && this.destreza > b.destreza ){
            double dano = calculaDano();
            b.recebeDano(dano);
            System.out.println("O ataque foi efetivo com " + dano + " pontos de dano!");
        }
        else if (forca < b.forca || destreza < b.destreza) {
            double dano = b.calculaDano();
            this.recebeDano(dano);
            System.out.println("O ataque foi inefetivo e revidado com " + dano + " pontos de dano!");
        }
        else {
            System.out.println("O ataque foi defendido, ninguem se machucou!");
        }
    }
    protected double calculaDano (){
        return forca * arma.getModificadorDano();
    }
    protected  void recebeDano(double pontosDano){
        saude -= pontosDano;
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
