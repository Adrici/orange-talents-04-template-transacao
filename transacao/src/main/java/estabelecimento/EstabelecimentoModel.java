package estabelecimento;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class EstabelecimentoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String cidade;
	@NotBlank
	private String endereco;

	public EstabelecimentoModel(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	@Deprecated
	public EstabelecimentoModel() {}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}


}
