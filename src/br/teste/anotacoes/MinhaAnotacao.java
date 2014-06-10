package br.teste.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface MinhaAnotacao {

	public String nome() default "";
	
	public String valor() default "Bem-Vindo";
}
