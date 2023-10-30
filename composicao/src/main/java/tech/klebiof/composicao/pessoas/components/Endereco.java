package tech.klebiof.composicao.pessoas.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;

}
