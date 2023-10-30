package tech.klebiof.composicao.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa {
    private int matricula;
    private BigDecimal salario;
    private LocalDate dataAdmisao;

    public BigDecimal getSalarioFormatado() {
        return salario.setScale(2, RoundingMode.HALF_UP);
    }


}
