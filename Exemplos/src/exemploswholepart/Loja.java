package exemploswholepart;

import java.util.ArrayList;

public class Loja {

    public String nome;
    public String cep;
    public Integer num;
    public String complemento;
    public final ArrayList<Cliente> listClientes = new ArrayList<>();

    
    public ArrayList<Cliente> getListClientes() {
        return listClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void mostraLoja() {
        for (Cliente cli : listClientes) {
            System.out.println("nome: " + nome);
            System.out.println("cep: " + cep);
            System.out.println("num: " + num);
            System.out.println("complemento: " + complemento);
            System.out.println("");
        }
    }

}
