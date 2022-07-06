package UEC;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Luta() {
        this.setRounds(5);
    }
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Impossível marcar essa luta!");
        }
    }
    
    public void lutar(){
        if (this.isAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            Random res = new Random();
            int winner = res.nextInt(3);
            switch(winner){
                case 0:
                    System.out.println("EMPATE!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome() + " venceu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome() + " venceu!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
}
