package transacao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long>{
	List<TransacaoModel> findFirst10ByCartaoNumeroOrderByEfetivadaEmDesc(String numero);
}
