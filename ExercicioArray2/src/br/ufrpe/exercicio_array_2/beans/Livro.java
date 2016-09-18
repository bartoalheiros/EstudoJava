//Aluno: José Bartolomeu Alheiros Dias Neto
//Int Prog 2. BCC - UFRPE
//Professor: Vanilson Burégio


package br.ufrpe.exercicio_array_2.beans;

public class Livro {
	private String codigo;
	private String titulo;
	private String autor;

	public Livro(String codigo, String titulo, String autor) {
		this.codigo = codigo;  	  
		this.titulo = titulo;
		this.autor = autor;
	}

	public Livro() {

	}

	public String getCodigo() {
		return this.codigo;	  
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo; 
	}

	public String getTitulo() {
		return this.titulo;  
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;  
	}

	public String getAutor() {
		return this.autor;  
	}

	public void setAutor(String autor) {
		this.autor = autor;  
	}

	public String toString ( ) {
		return "Título: " + this.titulo + "\n" + "Autor: " + this.autor + "\n" + "Código: " + this.codigo + "\n";	  
	}

}
