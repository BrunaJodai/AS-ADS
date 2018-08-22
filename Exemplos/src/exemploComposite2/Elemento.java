package exemploComposite2;

public abstract class Elemento implements IElemento {

    private String nome;

    public Elemento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
