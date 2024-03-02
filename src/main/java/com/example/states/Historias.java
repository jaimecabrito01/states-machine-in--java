package com.example.states;

public class Historias {
  private String descricao;
  private int pontosEstimados; // Pontos de história ou estimativa de esforço
  private boolean completada; // Indica se a história foi completada

  // Construtor
  public Historias(String descricao, int pontosEstimados) {
      this.descricao = descricao;
      this.pontosEstimados = pontosEstimados;
      this.completada = false; // Por padrão, uma história não está completada quando criada
  }

  // Método para marcar a história como completada
  public void marcarComoCompletada() {
      this.completada = true;
  }

  // Métodos getters e setters
  public String getDescricao() {
      return descricao;
  }

  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }

  public int getPontosEstimados() {
      return pontosEstimados;
  }

  public void setPontosEstimados(int pontosEstimados) {
      this.pontosEstimados = pontosEstimados;
  }

  public boolean isCompletada() {
      return completada;
  }

  public void setCompletada(boolean completada) {
      this.completada = completada;
  }
}

