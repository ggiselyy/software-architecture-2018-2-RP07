package edu.utfpr.cp.sa;
/**
 *
 * @author gisely
 */

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@RestController
public class FuncionarioDAO{

@PostMapping ("/funcioario")
public Funcionario create (@RequestBody Funcionario funcionario){
	funcionario.setId(UUID.randomUUID());
	return funcionario;
}

@GetMapping ("/funcionario")
public List <Funcionario> read(){
	return Stream.of(
		new Funcionario ("John Connor", 20, 5000),
		new Funcionario ("Sara Connor", 22, 5000)
		).collect(Collectors.toList());
} 

@PutMapping ("/funcionario")
public Funcionario update(@RequestBody Funcionario funcionario){
	funcionario.setNome(funcionario.getNome()+" -- atualizado!");
        return funcionario;
}

@DeleteMapping ("/funcionario/{id}")
public String delete (@PathVariable int id){
	return "deletado!";
}
}