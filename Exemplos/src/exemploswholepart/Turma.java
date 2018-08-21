package exemploswholepart;

import java.util.ArrayList;

public class Turma {

    public String nome;
    public final ArrayList<Aluno> listAlunos = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getListAlunos() {
        return listAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraTurma() {
        for (Aluno aluno : listAlunos) {
            System.out.println("matricula: " + aluno.getMatricula() + " nome: " + aluno.getNome());
        }
    }

}
