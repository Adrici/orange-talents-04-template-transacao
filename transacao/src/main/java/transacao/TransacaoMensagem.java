package transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import cartao.CartaoResponse;
import estabelecimento.EstabelecimentoResponse;


public class TransacaoMensagem {

	private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	private CartaoResponse cartao;
	private EstabelecimentoResponse estabelecimento;

	public TransacaoMensagem(TransacaoModel transacao) {
		this.id = transacao.getIdTransacao();
		this.valor = transacao.getValor();
		this.efetivadaEm = transacao.getEfetivadaEm();
		this.cartao = new CartaoResponse(transacao.getCartao().getNumero(), transacao.getCartao().getEmail());
		this.estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento().getNome(),
														   transacao.getEstabelecimento().getCidade(),
														   transacao.getEstabelecimento().getEndereco());
	}

	@Deprecated
	public TransacaoMensagem() {
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	public CartaoResponse getCartao() {
		return cartao;
	}

	public EstabelecimentoResponse getEstabelecimento() {
		return estabelecimento;
	}

	public TransacaoModel toModel() {
		return new TransacaoModel(id, valor, efetivadaEm, cartao.toModel(), estabelecimento.toModel());
	}
}
