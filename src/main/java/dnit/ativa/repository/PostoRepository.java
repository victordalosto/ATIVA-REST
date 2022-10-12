package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Modelo;
import dnit.ativa.model.Posto;

public interface PostoRepository extends JpaRepository<Posto, Integer>,
                                         JpaSpecificationExecutor<Modelo> {

}
