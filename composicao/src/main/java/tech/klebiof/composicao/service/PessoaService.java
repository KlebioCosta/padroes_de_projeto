package tech.klebiof.composicao.service;

import lombok.Data;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import tech.klebiof.composicao.pessoas.Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


@Service
public class PessoaService {
    public int obterIdade(Pessoa pessoa) {
        LocalDate dataNascimento = pessoa.getDataNascimento();
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

}
