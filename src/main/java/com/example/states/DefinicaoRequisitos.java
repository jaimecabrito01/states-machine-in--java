package com.example.states;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class DefinicaoRequisitos implements State {
  private Requisitos requisitos1;
  private Scanner scanner;


 
  public DefinicaoRequisitos(){

  }

  private ArrayList<Requisitos> InsertRequisitos(ArrayList<Requisitos> requisitos){
 
    
    
    return requisitos;
  }

  

  
  @Override
  public void proxEstado(MaquinaEstados maquinaEstados){
    scanner = new Scanner(System.in);
   Calendar calendar = Calendar.getInstance();
      
   
    ArrayList<Requisitos>  list = new ArrayList<>();
    System.out.println("Digite o numero de requisitos : \n");
    int numero = scanner.nextInt();
    int i =1;
   
    while (numero != i) {
      System.out.println("Digite o nome de quem fez o requisito : \n");
      String nome = scanner.nextLine();
      System.out.println("Conteudo: \n");
      String conteudo = scanner.nextLine();
      list.add(new Requisitos(nome, calendar.getTime(), conteudo));
      
      i++;
    }
    InsertRequisitos(list);
    System.out.println("Requisitos recebidos,serao analisados na proxima etapa");
      maquinaEstados.setEstado(new BackLog());
  }
}
