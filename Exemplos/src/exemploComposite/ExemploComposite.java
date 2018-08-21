package exemploComposite;

public class ExemploComposite {

    public static void main(String[] args) {

        Shopping shop = new Shopping("SP Market");
        shop.getLojas().add(new Roupas("dpto", "Renner"));
        shop.getLojas().add(new Roupas("infantil", "Tip Top"));
        shop.getLojas().add(new Eletronico("eletrônicos", "Fast Shop"));

        //instancia o mercado a parte, add as lojas e dps é add no shopping
        Supermercado sp = new Supermercado("Ricoy");
        sp.getLojas().add(new Refeicao("fastfood", "Habbibs"));
        sp.getLojas().add(new Refeicao("cafeteria", "Pão de Queijo"));

        //add o supermercado no shopping
        shop.getLojas().add(sp);

        shop.getInfo();

    }
}
