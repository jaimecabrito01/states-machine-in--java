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


  
private  ArrayList<Requisitos>  executaRequisitos(){
  scanner = new Scanner(System.in);
  Calendar calendar = Calendar.getInstance();
     
  
   ArrayList<Requisitos>  list = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
   

   System.out.println("Digite o número de requisitos:");
   int numero = scanner.nextInt();
   scanner.nextLine(); // Consumir a nova linha

   for (int i = 1; i <= numero; i++) {
       System.out.println("Digite o nome de quem fez o requisito:");
       String nome = scanner.nextLine();
       
       System.out.println("Conteúdo:");
       String conteudo = scanner.nextLine();
       
       list.add(new Requisitos(nome, calendar.getTime(), conteudo));
   }
   
   
   System.out.println("Requisitos recebidos,serao analisados na proxima etapa");
   return list;
}

  
  @Override
  public void proxEstado(MaquinaEstados maquinaEstados){
      
      maquinaEstados.setEstado(new BackLog(executaRequisitos()));
  }
}
