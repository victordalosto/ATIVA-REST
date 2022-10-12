package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dnit.ativa.model.Defensa;
import dnit.ativa.model.Modelo;

public interface DefensaRepository extends JpaRepository<Defensa, Integer>,
                                           JpaSpecificationExecutor<Modelo> {

}
