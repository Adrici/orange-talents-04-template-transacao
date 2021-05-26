package estabelecimento;

public class EstabelecimentoResponse {

	private String nome;
	private String cidade;
	private String endereco;

	public EstabelecimentoResponse(EstabelecimentoModel estabelecimento) {
		this.nome = estabelecimento.getNome();
		this.cidade = estabelecimento.getCidade();
		this.endereco = estabelecimento.getEndereco();
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