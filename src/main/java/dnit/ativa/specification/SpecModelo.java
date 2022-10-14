package dnit.ativa.specification;
import org.springframework.data.jpa.domain.Specification;

import dnit.ativa.model.Modelo;

public class SpecModelo {


    public static Specification<Modelo> criaSpec (
            String nome, String condicao, String uf, String br,
            String km, String kmi, String kmf) {
        return Specification.where(SpecModelo.UF(uf)
                            .and(SpecModelo.BR(br))
                            .and(SpecModelo.km(km))
                            .and(SpecModelo.kmi(kmi))
                            .and(SpecModelo.kmf(kmf))
                            .and(SpecModelo.nome(nome))
                            .and(SpecModelo.condicao(condicao)));
    }


    public static Specification<Modelo> UF(String uf) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (uf == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.equal(root.get("uf"), uf.toUpperCase());
        };
    }


    public static Specification<Modelo> BR(String br) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (br == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.equal(root.get("br"), br.replaceAll("[^0-9]+", ""));
        };
    }


    public static Specification<Modelo> condicao(String condicao) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (condicao == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.like(root.get("condicao"), "%" + condicao.toUpperCase() + "%");
        };
    }


    public static Specification<Modelo> nome(String nome) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (nome == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.like(root.get("nome"), "%" + nome.toUpperCase() + "%");
        };
    }


    public static Specification<Modelo> km(String km) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (km == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.equal(root.get("km"), Integer.valueOf(km));
        };
    }


    public static Specification<Modelo> kmi(String kmi) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (kmi == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.greaterThan(root.get("km"), Integer.valueOf(kmi));
        };
    }


    public static Specification<Modelo> kmf(String kmf) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (kmf == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.lessThan(root.get("km"), Integer.valueOf(kmf));
        };
    }

    
}
