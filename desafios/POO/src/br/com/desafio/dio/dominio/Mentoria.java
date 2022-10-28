package br.com.desafio.dio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
  
  // por default já cria esse constructor
  public Mentoria() {}
  
  // Boa prática, nos atributos utilizarmos o modificador de acesso private
  // LocalDate e LocalTime lidam com datas!
  private LocalDate data;
  
  @Override
  public double calcularXP() {
    return XP_PADRAO + 20d;
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
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", data=" + data +
            '}';
  }

}

