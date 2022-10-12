package dnit.ativa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import dnit.ativa.model.Gasolina;
import dnit.ativa.model.Modelo;

public interface GasolinaRepository extends JpaRepository<Gasolina, Integer>,
                                            JpaSpecificationExecutor<Modelo> {

}
