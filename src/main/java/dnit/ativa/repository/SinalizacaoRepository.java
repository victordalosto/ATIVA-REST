package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Modelo;
import dnit.ativa.model.Sinalizacao;

public interface SinalizacaoRepository extends APIRepository,
                                               JpaRepository<Sinalizacao, Integer>,
                                               JpaSpecificationExecutor<Modelo> {

}
