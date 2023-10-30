package tech.klebiof.composicao.pessoas;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.klebiof.composicao.pessoas.components.Cargo;
import tech.klebiof.composicao.pessoas.components.Contatos;
import tech.klebiof.composicao.pessoas.components.Endereco;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private Endereco endereco;
    private LocalDate dataNascimento;
    private Contatos telefones;
    private Cargo cargo;
}
