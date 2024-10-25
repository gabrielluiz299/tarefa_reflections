package br.com.gsoares;

import java.lang.annotation.Annotation;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<Informacao> informacao01 = Informacao.class;
		Annotation[] annotations = (Annotation[]) informacao01.getAnnotations();

		for (Annotation annotation : annotations) {

			if (annotation instanceof Tabela) {
				Tabela tabela01 = (Tabela) annotation;
				System.out.println(" *********************** " );
				System.out.println("Nome da Tabela: " + tabela01.nome());
				System.out.println("versão: " + tabela01.versao());

			}
		}
	}
}