import java.util.Random;

public class Arma implements Coletavel {
    private String nome;
    private int dano;
    private boolean coletado;
    
    public Arma(String nome) {
        this.nome = nome;
        Random r = new Random();
        this.dano = r.nextInt(1, 5);
        this.coletado = false;
    }

    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void descartar() {
        this.coletado = false;
        System.out.println("A arma " + this.nome + "foi descartada");
        
    }

    @Override
    public void pegar() {
        this.coletado = true;
        System.out.println("A arma " + this.nome + "foi pega");
        
    }

    @Override
    public void usar() {
        // TODO Auto-generated method stub
        
    }

    public boolean isColetado() {
        return coletado;
    }

    public void setColetado(boolean coletado) {
        this.coletado = coletado;
    }
}
