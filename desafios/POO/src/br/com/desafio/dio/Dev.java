package br.com.desafio.dio;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.desafio.dio.dominio.Conteudo;

public class Dev {
  private String nome;

  // Usamos HashSet pq: só teremos itens únicos.
  // É padrão derivarmos da classe mãe como Set<> = new LinkedHashSet<>
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {}

  public void progredir() {}

  public void calcularXP() {}
}
