package dnit.ativa.repository;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import dnit.ativa.model.Modelo;

/* Interface usada para implementar uma List<Repositorys> no Controller,
 * Adicionar todos no contexto da aplicação, sendo referenciado na List. */

public interface APIRepository {

    List<? extends Modelo> findAll(Specification<Modelo> especification);

    
}
