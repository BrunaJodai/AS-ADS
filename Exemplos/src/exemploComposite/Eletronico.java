package exemploComposite;

public class Eletronico extends Loja {

    private String tipoEletronico;

    public Eletronico(String tipoEletronico, String nome) {
        super(nome);
        this.tipoEletronico = tipoEletronico;
    }

    public String getTipoEletronico() {
        return tipoEletronico;
    }

    public void setTipoEletronico(String tipoEletronico) {
        this.tipoEletronico = tipoEletronico;
    }

    @Override
    public void getInfo() {
        System.out.println("Eletronico: " + super.getNome() + " | " + this.tipoEletronico);
    }

}
