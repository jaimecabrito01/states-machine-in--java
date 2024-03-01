package com.example.states;

public class MaquinaEstados {
  private State estadoAtual;

  public MaquinaEstados() {
      this.estadoAtual = new DefinicaoRequisitos(); // Definindo o estado inicial
  }

  public void setEstado(State estado) {
      this.estadoAtual = estado;
  }

  public void proximoEstado() {
      estadoAtual.proxEstado(this);
  }
}

