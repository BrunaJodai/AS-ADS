package exemploComposite;

public class Refeicao extends Loja {

    private String tipoRefeicao;

    public Refeicao(String tipoRefeicao, String nome) {
        super(nome);
        this.tipoRefeicao = tipoRefeicao;
    }

    public String getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(String tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    @Override
    public void getInfo() {
        System.out.println("Refeicao: " + super.getNome() + " | " + this.tipoRefeicao);
    }

}
