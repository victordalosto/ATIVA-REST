package dnit.ativa.controller.api;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnit.ativa.model.Modelo;
import dnit.ativa.repository.APIRepository;
import dnit.ativa.specification.SpecModelo;

@RestController
@RequestMapping("/api")
public class AtivaController {

    @Autowired
    Map<String, APIRepository> repositories;


    @GetMapping("/{path}")
    public List<? extends Modelo> get(
                @PathVariable("path") String path, 
                String nome, String condicao, 
                String uf,   String br, String km,
                String kmi,  String kmf) {
        APIRepository repository = findRepository(path);
        if (repository == null)
            return new ArrayList<>();
        try {
            Specification<Modelo> especification  =
                SpecModelo.criaSpec(nome, condicao, uf, br, km, kmi, kmf);
            return repository.findAll(especification);
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    

    private APIRepository findRepository(String tipo) {
        if (tipo == null)
            return null;
        return repositories.get(tipo.toLowerCase() + "Repository");
    }


}
