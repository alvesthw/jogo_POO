import java.util.Random;

public abstract class Personagem {
    private int id;
    private int nivel;
    private int dano;
    private int vida;
    private String nome;
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personagem( String nome) {
        Random r = new Random();
        this.id = r.nextInt(1, 100);
        this.nivel = r.nextInt(1, 10);
        this.dano = r.nextInt(1,10);
        this.vida = 100;
        this.nome = nome;
    }

    public int getForça() {return nivel;}

    public void setForça(int força) {this.nivel = força;}

    public int getVida() { return vida;}

    public void setVida(int vida) {this.vida = vida;}

    public int getDano() {return dano;}

    public void setDano(int dano) {this.dano = dano;}

    public abstract void atacar();

    public abstract void defender();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
