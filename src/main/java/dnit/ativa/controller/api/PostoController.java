package dnit.ativa.controller.api;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dnit.ativa.model.Modelo;
import dnit.ativa.repository.PostoRepository;
import dnit.ativa.specification.SpecModelo;

@RestController
@RequestMapping("/api/posto")
public class PostoController implements APIController {

    @Autowired
    private PostoRepository postoRepository;


    @GetMapping
    public List<? extends Modelo> get(String nome, String condicao, 
                                      String uf, String br, String km, 
                                      String kmi, String kmf) {
        Specification<Modelo> especification =
        Specification.where(SpecModelo.UF(uf)
                       .and(SpecModelo.BR(br))
                       .and(SpecModelo.km(km))
                       .and(SpecModelo.kmi(kmi))
                       .and(SpecModelo.kmf(kmf))
                       .and(SpecModelo.nome(nome)));
        return postoRepository.findAll(especification);
    }

    
}
