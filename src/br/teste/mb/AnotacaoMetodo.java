package br.teste.mb;

import java.lang.annotation.Annotation;

import br.teste.anotacoes.MinhaAnotacao;

@MinhaAnotacao(nome="Rodrigo Fortes")
public class AnotacaoMetodo {

	public static void main(String args[]){
		
		Class aClass = AnotacaoMetodo.class;
		Annotation[] annotations = aClass.getAnnotations();
		
		for (Annotation annotation : annotations) {
			MinhaAnotacao m = (MinhaAnotacao) annotation;
			System.out.println("nome: "+ m.nome());
			System.out.println("valor: "+ m.valor());
		}
		
	}
}
