package br.com.desafio.dio.dominio;
import java.time.LocalDate;

public class Mentoria {
    // Boa prática, nos atributos utilizarmos o modificador de acesso private
  
  private String titulo;
  private String descricao;
  // LocalDate e LocalTime lidam com datas!
  private LocalDate data;

  public String getTitulo () {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao () {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public LocalDate getData() {
    return data;
  }
  
  public void setData(LocalDate data) {
    this.data = data;
    
  }

  @Override
  public java.lang.String toString() {
    return "Mentoria{" +
            "titulo='" + titulo + '\'' +
            ", descricao='" + descricao + '\'' +
            ", data=" + data +
            '}';
  }
}

