package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public Aniversariante(String nome, DataAniversaio dataAniversaio){
		this.nome = nome;
		this.dataAniversario = dataAniversaio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Aniversariante) {
			Aniversariante outro = (Aniversariante) obj;

			boolean nomeIgual = (this.nome == null ? outro.nome == null : this.nome.equals(outro.nome));
			boolean dataIgual = (this.dataAniversario == null ? outro.dataAniversario == null : this.dataAniversario.equals(outro.dataAniversario));

			return nomeIgual && dataIgual;
		}
		return false;
	}

}
