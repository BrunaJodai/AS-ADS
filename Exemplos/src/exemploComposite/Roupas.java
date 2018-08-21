package exemploComposite;

public class Roupas extends Loja {

    private String tipoRoupa;

    public Roupas(String tipoRoupa, String nome) {
        super(nome);
        this.tipoRoupa = tipoRoupa;
    }

    public String getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(String tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    @Override
    public void getInfo() {
        System.out.println("Roupa: " + super.getNome() + " | " + this.tipoRoupa);
    }
}
