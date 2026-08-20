package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        this.aniversariantes.add(novo);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<>();
        DataAniversario dataProcurada = new DataAniversario(dia, mes);

        for (Aniversariante a : this.aniversariantes) {
            if (a.getDataAniversario() != null && a.getDataAniversario().equals(dataProcurada)) {
                nomesDoDia.add(a.getNome());
            }
        }
        return nomesDoDia;
    }


    public void removerAniversariante(String nomeAniversariante) {
        for (int i = 0; i < this.aniversariantes.size(); i++) {
            if (this.aniversariantes.get(i).getNome().equalsIgnoreCase(nomeAniversariante)) {
                this.aniversariantes.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Aniversariante> getAniversariantes() {
        return aniversariantes;
    }
}