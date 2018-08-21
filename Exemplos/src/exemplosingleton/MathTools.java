package exemplosingleton;

public class MathTools {

    //garante que a classe não seja instanciada
    private MathTools(){
        
    }
    
    //atributo estático disponivel em toda a solução
    public static double PI = 3.1;
    
    public static double getAreaRetangulo(double a, double b) {
        return a * b;
    }
    
    public static double getPerimetroRetangulo(double a, double b){
        return 2*(a+b);
    }
    
    public static double getAreaCircunferencia (double r){
        return PI*r*r;
    }
}
