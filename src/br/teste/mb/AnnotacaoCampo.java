package br.teste.mb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import br.teste.anotacoes.MinhaAnotacao;

public class AnnotacaoCampo {

	@MinhaAnotacao(nome = "Rodrigo Fortes", valor = "Bem-Vindo")
	public String meuCampo = "teste";
	
	public static void main(String args[]) throws NoSuchFieldException, SecurityException{
		
		AnnotacaoCampo object = new AnnotacaoCampo();
		Class classe = object.getClass();
		Field field = classe.getField("meuCampo"); 

		Annotation[] annotations = field.getDeclaredAnnotations();

		for(Annotation annotation : annotations){
			if(annotation instanceof MinhaAnotacao){
				MinhaAnotacao minhaAnotacao = (MinhaAnotacao) annotation;
				System.out.println("name: " + minhaAnotacao.nome());
				System.out.println("value: " + minhaAnotacao.valor());
			}
		}
	}
}
