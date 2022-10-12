package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Modelo;
import dnit.ativa.model.Semaforo;

public interface PardalRepository extends JpaRepository<Semaforo, Integer>,
                                          JpaSpecificationExecutor<Modelo> {

}
