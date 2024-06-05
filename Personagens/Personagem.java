package Personagens;

import Armas.Arma;

//classe personagem
public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;
    //construtor
    public Personagem (String nomeTipo, double saude, double forca, double destreza,Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;

    }

    public void printStatus(){
        //verifica se o personagem esta morto caso esteja informa que esta morto e logo depos seus status
        if (estaMorto()){
            System.out.println(nomeTipo + " [Morreu, Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        }
        //se nao mostra seu nome e seus status
        else{
            System.out.println(nomeTipo + " [Saude: " + saude + ", Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        }
    }
    public void atacar (Personagem b){
        //verifica se o personagem esta morto caso esteja informa que nao consegue atacar
        if (estaMorto()){
            System.out.println("O " + nomeTipo + " não consegue atacar, pois está morto.");
            return;
        }
        // se nao mostar que o personagem atacou o outro
        System.out.println("O " + nomeTipo + " ataca o " + b.nomeTipo + " com " + arma.getNome() + ".");
        //verifica se o outro personagem esta morto se etiver informa que o mesmo ja esta morto
        if (b.estaMorto()) {
            System.out.println("Pare! O " + b.nomeTipo + " já está morto!");
            return;
        }
        //verifica se a forca e destreza do personagem atacante é maior que do defensor se for o ataca é efetivo
        if (this.forca > b.forca && this.destreza > b.destreza ){
            double dano = calculaDano();
            b.recebeDano(dano);
            System.out.println("O ataque foi efetivo com " + dano + " pontos de dano!");
        }
        //verifica se a forca ou destreza do personagem atacante é menor que do defensor se for o ataque é revidado
        else if (forca < b.forca || destreza < b.destreza) {
            double dano = b.calculaDano();
            this.recebeDano(dano);
            System.out.println("O ataque foi inefetivo e revidado com " + dano + " pontos de dano!");
        }
        //se nao o ataque é defendido
        else {
            System.out.println("O ataque foi defendido, ninguem se machucou!");
        }
    }
    //recebe a forca do personagem * o modificador de dano da arma
    protected double calculaDano (){
        return forca * arma.getModificadorDano();
    }
    //reduz os pontos de saude com base na vida perdida
    protected  void recebeDano(double pontosDano){
        saude -= pontosDano;
    }// verifica se esta morto 
    private boolean estaMorto (){
        if (this.saude < 1){
            return true;
        }
        else {
            return false;
        }
    }
}
