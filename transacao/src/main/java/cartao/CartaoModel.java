package cartao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class CartaoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String numero;
	@Email
	private String email;

	public CartaoModel(String numero, String email) {
		this.numero = numero;
		this.email = email;
	}

	@Deprecated
	public CartaoModel() {}

	public Long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public String getEmail() {
		return email;
	}

	public CartaoModel toModel() {
		return new CartaoModel(numero, email);
	}
	
	
}