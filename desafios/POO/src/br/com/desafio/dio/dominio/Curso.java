package br.com.desafio.dio.dominio;

public class Curso extends Conteudo {
  // Boa prática, nos atributos utilizarmos o modificador de acesso private
  private int cargaHoraria;

  @Override
  public double calcularXP() {
    return XP_PADRAO + cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  @Override
  public String toString() {
    return "Curso [titulo=" + getTitulo() +
      ", descricao=" + getDescricao()
      + ", cargaHoraria=" + cargaHoraria + "]";
  }

}
