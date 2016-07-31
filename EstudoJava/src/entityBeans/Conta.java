package entityBeans;

public class Conta {
  int numero;
  String dono;
  double saldo;
  double limite;
  
  //Método que saca uma determinada quantidade de dinheiro de uma Conta;
  //Cria uma variavel double chamada "novoSaldo" e armazena o valor
  //de novoSaldo em this.saldo.
  //Esse novoSaldo é o saldo corrente da Conta
  //menos a quantidade digitada pelo usuário. 
  boolean saca(double valor) {
	if (this.saldo < valor) { 
	  return false;
	}
	else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }
  
  //Método para depositar uma determinada quantia em uma conta.
  //Atualiza o atributo this.saldo com a quantia em dinheiro
  //selecionada para depósito.
  void deposita(double valor) {
    this.saldo += valor;	  
  }
  
  boolean transfere(Conta destino, double valor) {
    boolean retirou = this.saca(valor);
    if(retirou == false) {
      // não deu pra sacar!
      return false;	
    }
    else {
      destino.deposita(valor);
      return true;
    }
  }
}
