package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Modelo;
import dnit.ativa.model.Pardal;

public interface PardalRepository extends APIRepository,
                                          JpaRepository<Pardal, Integer>,
                                          JpaSpecificationExecutor<Modelo> {

}
