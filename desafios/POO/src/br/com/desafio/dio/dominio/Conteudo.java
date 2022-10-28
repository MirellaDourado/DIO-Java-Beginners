package br.com.desafio.dio.dominio;

// classe abstrata = que dizer que não é possivel instanciar a classe
public abstract class Conteudo {
 
  //protected = somente as filhas poderam ter acesso
  // static = essa classe poderá ser acessada fora da classe conteúdo
  protected static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  // abstract = as classes que extendeerem de conteudos serão obrigados a implementar uma logica neste método
  public abstract double calcularXP();

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
}
