package com.example.states;

import java.util.ArrayList;

public class BackLog implements State {
  private ArrayList<Requisitos> requisitos;
  

  
  public BackLog(ArrayList<Requisitos> requisitos) {
    this.requisitos = requisitos;
  }

  public void historias(){
    for (ArrayList<Requisitos> iterable_element : iterable) {
      
    }
  }



  @Override
  public void proxEstado(MaquinaEstados maquinaEstados){
     maquinaEstados.setEstado(new PlanejamentoSprint());
  }
}
