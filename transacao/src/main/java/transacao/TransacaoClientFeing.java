package transacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import cartao.CartaoRequest;

@FeignClient(value = "transacao", url = "${transacao.host}")
public interface TransacaoClientFeing {

	@PostMapping
	void efetuarTransacao(@RequestBody CartaoRequest transacao);

	@DeleteMapping("/{id}")
	void encerrarTransacao(@PathVariable("id") String id);
}