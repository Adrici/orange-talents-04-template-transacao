package transacao;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cartao.CartaoRequest;
import feign.FeignException;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

	@Autowired
	private TransacaoClientFeing transacaoClientFeing;

	@PostMapping
	public ResponseEntity<?> enviarTransacao(@RequestBody @Valid CartaoRequest request) {
		try {
			transacaoClientFeing.efetuarTransacao(request);
			return ResponseEntity.ok("Iniciando a transação...");
		} catch (FeignException.FeignServerException | FeignException.FeignClientException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Algo de errado não está certo!");
		}

	}

	@DeleteMapping("{id}")
    public ResponseEntity<?> parar(@PathVariable("id") String id){
        try{
            transacaoClientFeing.encerrarTransacao(id);
            return ResponseEntity.ok("Transação Efetuada");
        }catch (FeignException.FeignServerException | FeignException.FeignClientException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Algo de errado não está certo!");
        }
    }
}
