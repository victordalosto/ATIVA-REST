package dnit.ativa.controller.api;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dnit.ativa.model.Modelo;
import dnit.ativa.repository.IluminacaoRepository;
import dnit.ativa.specification.SpecModelo;

@RestController
@RequestMapping("/api/iluminacao")
public class IluminacaoController implements APIController {

    @Autowired
    private IluminacaoRepository iluminacaoRepository;


    @GetMapping
    public List<? extends Modelo> get(String nome, String condicao, 
                                      String uf, String br, String km, 
<<<<<<< HEAD
                                      String kmi, String kmf) {
        Specification<Modelo> especification =
        Specification.where(SpecModelo.UF(uf)
                       .and(SpecModelo.BR(br))
                       .and(SpecModelo.km(km))
                       .and(SpecModelo.kmi(kmi))
                       .and(SpecModelo.kmf(kmf))
                       .and(SpecModelo.nome(nome)));
=======
                                      String kmI, String kmF) {
        if (nome == null && condicao == null && uf == null && br == null 
            && km == null && kmI == null && kmF == null)
            return iluminacaoRepository.findAll();
        Specification<Modelo> especification =
        Specification.where(SpecModelo.UF(uf)
                        .and(SpecModelo.BR(br))
                        .and(SpecModelo.km(km))
                        .and(SpecModelo.kmI(kmI))
                        .and(SpecModelo.kmF(kmF))
                        .and(SpecModelo.nome(nome)));
>>>>>>> bb531304c47b727a5cb6188f3745098e415cff1c
        return iluminacaoRepository.findAll(especification);
    }

    
}
