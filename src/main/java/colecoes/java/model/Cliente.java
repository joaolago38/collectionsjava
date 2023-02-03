package colecoes.java.model;

import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private String nome;
    private String endereço;
    private String documento;
    private String uf;
}
