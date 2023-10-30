package tech.klebiof.composicao.pessoas;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.klebiof.composicao.pessoas.components.Profissao;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;


}
