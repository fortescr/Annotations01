package br.teste.mb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import br.teste.anotacoes.MinhaAnotacao;

public class AnnotacaoMetodo {

	public static void main (String args[]) throws NoSuchMethodException, SecurityException{
		
		AnnotacaoMetodo object = new AnnotacaoMetodo(); 
		Class classe = object.getClass(); 
		Method method = classe.getDeclaredMethod("metodoTeste"); 
		Annotation[] annotations = method.getDeclaredAnnotations(); 
		 
		for(Annotation annotation : annotations){
		 
		    if(annotation instanceof MinhaAnotacao){
		 
		        MinhaAnotacao minhaAnotacao = (MinhaAnotacao) annotation; 
		        System.out.println("name: " + minhaAnotacao.nome()); 
		        System.out.println("value: " + minhaAnotacao.valor());
		 
		     }
		}
	}
	
	@MinhaAnotacao(nome = "Rodrigo Fortes")
    public void metodoTeste(){
         //TODO
     }  
}
