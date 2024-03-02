package com.example.states;

import java.util.Date;

public class Requisitos {
  private String nomeUsuario;
  private Date dataCriacao;
  private String conteudo;

  
  public Requisitos(String nomeUsuario, Date dataCriacao, String conteudo) {
    this.nomeUsuario = nomeUsuario;
    this.dataCriacao = dataCriacao;
    this.conteudo = conteudo;
  }
  public String getNomeUsuario() {
    return nomeUsuario;
  }
  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }
  public Date getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }
 

  


  
}
