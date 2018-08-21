package exemplosingleton;

public class UserManager {

    private UserManager() {

    }

    public static String nome;
    public static String senha;
    public static String dataUltimoAcesso;
    public static String ip;

    public static void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Data Último Acesso: " + dataUltimoAcesso);
        System.out.println("IP: " + ip);
    }

}
