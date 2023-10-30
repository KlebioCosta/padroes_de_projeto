package tech.klebiof.composicao.pessoas.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private String nome;
    private BigDecimal salarioBase;

}
