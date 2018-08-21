package exemploComposite;

import java.util.ArrayList;

public class Supermercado extends Loja {

    private final ArrayList<ILoja> lojas = new ArrayList<>();

    public Supermercado(String nome) {
        super(nome);
    }

    public ArrayList<ILoja> getLojas() {
        return lojas;
    }

    @Override
    public void getInfo() {
        System.out.println("Supermercado: " + super.getNome());

        for (ILoja loja : lojas) {
            loja.getInfo();
        }
    }

}
