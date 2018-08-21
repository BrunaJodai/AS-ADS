package exemploComposite;

import java.util.ArrayList;

public class Shopping {

    private String nome;
    private final ArrayList<ILoja> lojas = new ArrayList<>();

    public Shopping(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ILoja> getLojas() {
        return lojas;
    }

    public void getInfo() {
        System.out.println("Shopping: " + this.getNome());

        for (ILoja loja : lojas) {
            loja.getInfo();
        }
    }

}
