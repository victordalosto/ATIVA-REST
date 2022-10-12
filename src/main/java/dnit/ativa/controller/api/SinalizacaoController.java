package dnit.ativa.controller.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnit.ativa.model.Modelo;
import dnit.ativa.repository.SinalizacaoRepository;
import dnit.ativa.specification.SpecModelo;

@RestController
@RequestMapping("/api/sinalizacao")
public class SinalizacaoController implements APIController {

    @Autowired
    private SinalizacaoRepository sinalizacaoRepository;


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
                       .and(SpecModelo.nome(nome))
                       .and(SpecModelo.condicao(condicao)));
        return sinalizacaoRepository.findAll(especification);
    }

    
}
