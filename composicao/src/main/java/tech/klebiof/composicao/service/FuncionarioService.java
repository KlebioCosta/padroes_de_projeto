package tech.klebiof.composicao.service;

import org.springframework.stereotype.Service;
import tech.klebiof.composicao.pessoas.Funcionario;

import java.math.BigDecimal;

@Service
public class FuncionarioService {
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal novoSalario = funcionario.getSalario().add(aumento);
        funcionario.setSalario(novoSalario);
    }
}
