package br.ufrpe.exercicio_array_2.programas;

import br.ufrpe.exercicio_array_2.beans.Livro;
import br.ufrpe.exercicio_array_2.repositorios.RepositorioLivros;

public class ProgramaLivrosTest {

	public static void main(String[] args) {
		RepositorioLivros repo = new RepositorioLivros();
		Livro liv = new Livro();
		Livro liv2 = new Livro();
		Livro livPesq = new Livro();
		Livro livPesq2 = new Livro();

		liv.setTitulo("A Montanha Mágica");
		liv.setAutor("Thomas Mann");
		liv.setCodigo("111111111-1");
		repo.inserir(liv);

		liv2.setTitulo("Demian");
		liv2.setAutor("Hermann Hesse");	  
		liv2.setCodigo("222222222-2");
		repo.inserir(liv2);

		livPesq = repo.buscar("222222222-2");
		livPesq2 = repo.buscar("111111111-1");

		System.out.println(livPesq);
		System.out.println(livPesq2);

		repo.remover("222222222-2");
		livPesq = repo.buscar("222222222-2");


		System.out.println(livPesq);


	}

}
