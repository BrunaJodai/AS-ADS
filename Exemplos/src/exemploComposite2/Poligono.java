package exemploComposite2;

import java.util.ArrayList;

public abstract class Poligono extends Elemento {

    private final ArrayList<IElemento> elementos = new ArrayList<>();

    private double tamanhoPoligono;

    public Poligono(String nome) {
        super(nome);
    }

}
