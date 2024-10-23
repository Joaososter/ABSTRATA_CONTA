abstract class ContaBancaria {
    public double saldo;

    // Métodos abstratos para os atributos sacar, depositar e consultar saldo
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultarSaldo();
}

// Classe concreta ContaPoupanca
class ContaPoupanca extends ContaBancaria {
    public static final double TAXA_SAQUE = 0.10;
    public static final double TAXA_DEPOSITO = 0.05;
    public static final double TAXA_CONSULTA = 0.02;


    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void sacar(double valor) {
        if (valor + TAXA_SAQUE > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= (valor + TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso. Taxa de saque: " + TAXA_SAQUE);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa de depósito: " + TAXA_DEPOSITO);
    }

    @Override
    public void consultarSaldo() {
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}

// Classe concreta ContaCorrente
class ContaCorrente extends ContaBancaria {
    public static final double TAXA_SAQUE = 0.20;
    public static final double TAXA_DEPOSITO = 0.10;
    public static final double TAXA_CONSULTA = 0.05;
    public double limite;

    // Construtor
    public ContaCorrente(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor + TAXA_SAQUE > saldo + limite) {
            System.out.println("Saldo insuficiente, mesmo com limite.");
        } else {
            saldo -= (valor + TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso. Taxa de saque: " + TAXA_SAQUE);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa de depósito: " + TAXA_DEPOSITO);
    }

    @Override
    public void consultarSaldo() {
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}