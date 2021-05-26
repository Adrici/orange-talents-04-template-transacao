package transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import cartao.CartaoModel;
import cartao.CartaoResponse;
import estabelecimento.EstabelecimentoModel;
import estabelecimento.EstabelecimentoResponse;


public class TransacaoMensagem {

	private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	private CartaoModel cartao;
	private EstabelecimentoModel estabelecimento;



	public TransacaoMensagem(TransacaoModel transacao) {
	
		this.valor = transacao.getValor();
		this.efetivadaEm = transacao.getEfetivadaEm();
		this.cartao = transacao.getCartao();
		this.estabelecimento = transacao.getEstabelecimento();
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

	public CartaoModel getCartao() {
		return cartao;
	}

	public EstabelecimentoModel getEstabelecimento() {
		return estabelecimento;
	}

	public TransacaoModel toModel() {
		return new TransacaoModel(id, valor, efetivadaEm, cartao.toModel(), estabelecimento.toModel());
	
	}
}
