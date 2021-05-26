package transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;
import cartao.CartaoModel;
import estabelecimento.EstabelecimentoModel;

@Entity
public class TransacaoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String idTransacao;
	@NotNull
	@Positive
	private BigDecimal valor;  
	@NotNull
	@CreationTimestamp
	private LocalDateTime efetivadaEm;
	@NotNull
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private CartaoModel cartao;
	@NotNull
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private EstabelecimentoModel estabelecimento;

	public TransacaoModel(String idTransacao, BigDecimal valor, LocalDateTime efetivadaEm, CartaoModel cartao, EstabelecimentoModel estabelecimento) {
		this.idTransacao = idTransacao;
		this.valor = valor;
		this.efetivadaEm = efetivadaEm;
		this.cartao = cartao;
		this.estabelecimento = estabelecimento;
	}

	@Deprecated
	public TransacaoModel() {}

	public Long getId() {
		return id;
	}

	public String getIdTransacao() {
		return idTransacao;
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

}