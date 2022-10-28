package br.com.desafio.dio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import br.com.desafio.dio.dominio.Conteudo;

public class Devs {
  private String nome;

  // Usamos HashSet pq: só teremos itens únicos.
  // É padrão derivarmos da classe mãe como Set<> = new LinkedHashSet<>
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    // adiciona os conteudos do bootcamp aos conteúdos inscritos do dev
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    // adiciona o dev aos devs inscritos do bootcamp
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if(conteudo.isPresent()) {
      // adiciona o conteúdo aos conteudosConcluídos
      this.conteudosConcluidos.add(conteudo.get());
      // retira o conteúdo dos conteúdos inscritos
      this.conteudosInscritos.remove(conteudo.get());
    } else {
      // caso seja nulo(n possua nada) dispara um erro no console
      System.err.println("Você não está matriculado em nenhum conteúdo.");
    }
  }

  public double calcularXP() {
    return this.conteudosConcluidos
    .stream()
    .mapToDouble(conteudo -> conteudo.calcularXP())
    .sum();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Devs other = (Devs) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (conteudosInscritos == null) {
      if (other.conteudosInscritos != null)
        return false;
    } else if (!conteudosInscritos.equals(other.conteudosInscritos))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  }

  
}
