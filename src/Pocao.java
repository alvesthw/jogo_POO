

public class Pocao implements Coletavel {
    private final static double cura = 0.25;

    public static double getCura() {
        return cura;
    }

    private boolean usado;
    private boolean coletado;

    public boolean isColetado() {
        return coletado;
    }

    public void setColetado(boolean coletado) {
        this.coletado = coletado;
    }

    public Pocao(String nome) {
        this.usado = false;
        this.coletado = false;
    }
    
    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    @Override
    public void descartar() {
        this.coletado = false;
        System.out.println("A poção foi descartada.");
        
    }

    @Override
    public void pegar() {
        this.coletado = true;
        System.out.println(" poção foi pega.");
        
    }

    @Override
    public void usar() {
        this.coletado = false;
        System.out.println("A poção foi usada.");
        
    }

    

}