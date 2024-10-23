public class Principal {
    public static void main(String[] args) {
    
        ContaBancaria contaPoupanca = new ContaPoupanca(1000);  
        ContaBancaria contaCorrente = new ContaCorrente(1000, 600);  

        System.out.println("Operações na Conta Poupança:");
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(100);


        System.out.println("\nOperações na Conta Corrente:");
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
    }
}