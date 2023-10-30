package tech.klebiof.composicao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tech.klebiof.composicao.pessoas.Funcionario;
import tech.klebiof.composicao.pessoas.Pessoa;
import tech.klebiof.composicao.pessoas.components.Cargo;
import tech.klebiof.composicao.pessoas.components.Contatos;
import tech.klebiof.composicao.pessoas.components.Endereco;
import tech.klebiof.composicao.pessoas.components.Profissao;
import tech.klebiof.composicao.service.FuncionarioService;
import tech.klebiof.composicao.service.PessoaService;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class ComposicaoApplication {

	@Autowired
	private static PessoaService pessoaService;

	@Autowired
	private static FuncionarioService funcionarioService;

	public static void main(String[] args) {
		SpringApplication.run(ComposicaoApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(ComposicaoApplication.class, args);

		PessoaService pessoaService = context.getBean(PessoaService.class);
		FuncionarioService funcionarioService = context.getBean(FuncionarioService.class);

		capiturarDados(pessoaService, funcionarioService);
		((ConfigurableApplicationContext) context).close();
	}
	public static void capiturarDados(PessoaService pessoaService, FuncionarioService funcionarioService) {

		Endereco endereco = new Endereco();
		endereco.setRua("Lago Seco");
		endereco.setNumero(12);
		endereco.setBairro("SP");
		endereco.setCidade("Sousa");
		endereco.setCep("58800000");

		Contatos contatos = new Contatos();
		contatos.setTelefone("(83)98100-8100");
		contatos.setTipo("celular");

		Cargo cargo = new Cargo();
		cargo.setNome("Seca gelo");
		cargo.setSalarioBase(BigDecimal.valueOf(4500.00));

		Profissao profissao = new Profissao();
		profissao.setDepartamento("Indefinido");
		profissao.setNome("Coletor de Vento");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Klébio");
		pessoa.setEndereco(endereco);
		pessoa.setDataNascimento(LocalDate.of(1993, 8, 27));
		pessoa.setCargo(cargo);



		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(BigDecimal.valueOf(6000.00));
		funcionario.setDataAdmisao(LocalDate.of(2000, 2, 10));

		funcionarioService.reajustarSalario(funcionario, BigDecimal.valueOf(300.00));

		System.out.println("Salário do " + funcionario.getNome() + " após reajuste: " + funcionario.getSalario());

		int idade = pessoaService.obterIdade(pessoa);
		System.out.println("Nome: " + pessoa.getNome() + ", idade: " + idade);


	}
}
