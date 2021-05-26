package transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import estabelecimento.EstabelecimentoResponse;


public class TransacaoResponse {

	private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	private EstabelecimentoResponse estabelecimento;

	public TransacaoResponse(TransacaoModel transacao) {
		this.id = transacao.getIdTransacao();
		this.valor = transacao.getValor();
		this.efetivadaEm = transacao.getEfetivadaEm();
		this.estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento());
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

	public EstabelecimentoResponse getEstabelecimento() {
		return estabelecimento;
	}

}
