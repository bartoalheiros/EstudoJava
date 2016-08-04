package com.estudo_java.model;

public class Programa {

  public static void main(String[] args) {
    //Cria a conta
	Conta minhaConta;
    minhaConta = new Conta();
    
    //Alterando os valores de minhaConta
    minhaConta.dono = "Joao Paulo";
    minhaConta.saldo = 1000;
    
    // saca 200 reais
    minhaConta.saca(200);
    
    // deposita 500 reais
    minhaConta.deposita(500);
    
    System.out.println(minhaConta.saldo);

  }

}
