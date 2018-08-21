package exemplosingleton;

public class ExemploSingleton {

    public static void main(String[] args) {
        
        //MathTools m = new MathTools();
        
        double a = MathTools.getAreaRetangulo(3, 4);
        a = MathTools.getPerimetroRetangulo(3, 4);
               
        //alterando a variavel global na classe MathTools
        MathTools.PI = 3.1415;
        
        double c = MathTools.getAreaCircunferencia(11);
        
        UserManager.nome = "aaaa";
        UserManager.senha = "1234";
        UserManager.dataUltimoAcesso = "14/08/2018";
        UserManager.ip = "192.168.201.100";
        
        UserManager.imprimeDados();

    }

}
