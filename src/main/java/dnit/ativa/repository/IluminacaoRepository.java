package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Iluminacao;
import dnit.ativa.model.Modelo;

public interface IluminacaoRepository extends JpaRepository<Iluminacao, Integer>,
                                              JpaSpecificationExecutor<Modelo> {

}
