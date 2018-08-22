package exemploComposite2;

public class Linha extends Elemento {

    private Ponto a;
    private Ponto b;

    public Linha(Ponto a, Ponto b, String nome) {
        super(nome);
        this.a = a;
        this.b = b;
    }

    @Override
    public void getInfo() {
        System.out.println("Linha: " + super.getNome());
        System.out.println("Ponto a: " + this.a + " | Ponto b: " + this.b);
    }

}
