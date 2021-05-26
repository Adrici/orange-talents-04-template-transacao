package estabelecimento;

public class EstabelecimentoResponse {

	private String nome;
	private String cidade;
	private String endereco;

	public EstabelecimentoResponse(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	@Deprecated
	public EstabelecimentoResponse() {}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public EstabelecimentoModel toModel() {
		return new EstabelecimentoModel(nome, cidade, endereco);
	}

}