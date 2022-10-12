package dnit.ativa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@Entity  @Table(name = "cachedefeito")
public class Defeito implements Modelo {

    @Id  @JsonIgnore
    private Integer id;

    @Column(columnDefinition = "CHAR")
    private String nome;

    @Transient
    private String condicao = "RUIM";

    @Column(columnDefinition = "CHAR")
    private String uf;

    @Column(columnDefinition = "CHAR")
    private String br;

    private Integer km;
    private Double x;
    private Double y;
    
    
}
