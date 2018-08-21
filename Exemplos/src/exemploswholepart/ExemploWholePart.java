package exemploswholepart;

public class ExemploWholePart {
    
    public static void main(String[] args) {
        
        Turma tads = new Turma("TADSB");
        
        tads.getListAlunos().add(new Aluno ("aaa", 1111));
        tads.getListAlunos().add(new Aluno ("bbb", 2222));
        tads.getListAlunos().add(new Aluno ("ccc", 3333));
        tads.mostraTurma();
        
        
        Loja loja = new Loja();
        
        loja.getListClientes().add(new Cliente ("luisa","253.365.654-55"));
        loja.getListClientes().add(new Cliente ("ricardo","526.698.852-22"));
        loja.getListClientes().add(new Cliente ("maria","567.521.455-31"));
        loja.mostraLoja();
    }  
    
}
