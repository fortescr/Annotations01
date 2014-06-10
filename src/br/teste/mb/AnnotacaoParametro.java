package br.teste.mb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import br.teste.anotacoes.MinhaAnotacao;

public class AnnotacaoParametro {

	public static void meuMetodo (@MinhaAnotacao(nome="Rodrigo Fortes", valor="Bem-Vindo") String parameter) {
	}

	public static void main (String args[]) throws NoSuchMethodException, SecurityException {

		AnnotacaoParametro object = new AnnotacaoParametro(); 
		Class classe = object.getClass(); 
		Method method = classe.getDeclaredMethod("meuMetodo"); 
		Annotation[][] parameterAnnotations = method.getParameterAnnotations(); 
		Class[] parameterTypes = method.getParameterTypes(); 
		int i = 0; 

		for(Annotation[] annotations : parameterAnnotations){
			Class parameterType = parameterTypes[i++];

			for(Annotation annotation : annotations){

				if(annotation instanceof MinhaAnotacao){

					MinhaAnotacao minhaAnotacao = (MinhaAnotacao) annotation; 
					System.out.println("param: " + parameterType.getName()); 
					System.out.println("name : " + minhaAnotacao.nome()); 
					System.out.println("value: " + minhaAnotacao.valor());

				}
			}
		}
	}
}
