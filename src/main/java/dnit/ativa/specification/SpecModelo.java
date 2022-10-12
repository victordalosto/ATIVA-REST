package dnit.ativa.specification;
import org.springframework.data.jpa.domain.Specification;
import dnit.ativa.model.Modelo;

public class SpecModelo {


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


    public static Specification<Modelo> kmI(String kmI) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (kmI == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.greaterThan(root.get("km"), Integer.valueOf(kmI));
        };
    }


    public static Specification<Modelo> kmF(String kmF) {
        return (root, criteriaQuery, criteriaBuilder) ->  {
            if (kmF == null)
                return criteriaBuilder.conjunction();
            return criteriaBuilder.lessThan(root.get("km"), Integer.valueOf(kmF));
        };
    }

    
}
