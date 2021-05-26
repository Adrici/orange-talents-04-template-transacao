package cartao;

public class CartaoResponse {

	private String numero;

    private String email;

	public CartaoResponse(String numero, String email) {
		this.numero = numero;
		this.email = email;
	}

	@Deprecated
	public CartaoResponse() {}

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