public class Heroi extends Personagem {
    private Coletavel item;

    public Coletavel getItem() {
        return item;
    }

    public void setItem(Coletavel item) {
        this.item = item;
    }

    public Heroi(String nome) {
        super(nome);
        this.item = null;
    }

    public void habilidade(){
        System.out.println();
    }
    

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub
        
    }
    

    
}
