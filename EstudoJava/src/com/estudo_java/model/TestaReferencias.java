package com.estudo_java.model;

public class TestaReferencias {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.deposita(100);
    
    Conta c2 = c1; // !!
    c2.deposita(200);
    
    System.out.println(c1.saldo);
    System.out.println(c2.saldo);
  }

}
