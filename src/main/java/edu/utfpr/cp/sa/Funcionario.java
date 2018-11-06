package edu.utfpr.cp.sa;

/**
 *
 * @author gisely
 */

import java.util.UUID;

public class Funcionario{
	private UUID id;
	private String nome;
	private int idade;
        private float salario;
	
	//sets e gets;
	
	public Funcionario(String nome, int idade, float salario){
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }
        public void setID(){
            this.id = id;
        }
        
        public UUID getID(){
            return id;
        }
        
        public void setNome(){
            this.nome = nome;
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public String getNome(){
            return nome;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public int getIdade(){
            return idade;
        }
        
        public void setSalario(float salario){
            this.salario = salario;
        }
        
        public float getSalario(){
            return salario;
        }

    void setId(UUID randomUUID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
	
