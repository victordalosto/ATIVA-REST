package dnit.ativa.controller.api;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dnit.ativa.model.Modelo;
import dnit.ativa.repository.SemaforoRepository;
import dnit.ativa.specification.SpecModelo;

@RestController
@RequestMapping("/api/semaforo")
public class SemaforoController implements APIController {

    @Autowired
    private SemaforoRepository semaforoRepository;


    @GetMapping
    public List<? extends Modelo> get(String nome, String condicao, 
                                      String uf, String br, String km, 
                                      String kmi, String kmf) {
        Specification<Modelo> especification =
            SpecModelo.criaSpec(uf, br, km, kmi, kmf, nome, null);
        return semaforoRepository.findAll(especification);
    }

    
}