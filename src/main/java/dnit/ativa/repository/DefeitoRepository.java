package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import dnit.ativa.model.Defeito;
import dnit.ativa.model.Modelo;

public interface DefeitoRepository extends JpaRepository<Defeito, Integer>,
                                           JpaSpecificationExecutor<Modelo> {

}
