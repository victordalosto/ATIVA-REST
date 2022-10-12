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
                                      String kmI, String kmF) {
        if (nome == null && condicao == null && uf == null && br == null 
            && km == null && kmI == null && kmF == null)
            return postoRepository.findAll();
        Specification<Modelo> especification =
        Specification.where(SpecModelo.UF(uf)
                        .and(SpecModelo.BR(br))
                        .and(SpecModelo.km(km))
                        .and(SpecModelo.kmI(kmI))
                        .and(SpecModelo.kmF(kmF))
                        .and(SpecModelo.nome(nome)));
        return postoRepository.findAll(especification);
    }

    
}
