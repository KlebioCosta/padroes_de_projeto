package tech.klebiof.composicao.pessoas.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contatos {
    private String telefone;
    private String tipo;
}
