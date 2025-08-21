🏦 Desafio: Conta Bancária – Java
🎯 Objetivo

Implementar uma classe ContaBancaria que permita simular operações bancárias básicas, como:

Consultar saldo

Depositar valores

Sacar valores

Aplicar regras de negócio (não permitir saldo negativo, validar depósitos)

📋 Regras do Desafio

O atributo saldo deve ser privado (private) e acessível apenas via getters e métodos controlados.

Todos os depósitos devem ser positivos.

Saques não podem deixar o saldo negativo.

Utilizar encapsulamento para proteger os dados da conta.

📂 Estrutura do Projeto
conta-bancaria/
└── src/
    └── br/com/dio/contabancaria/
        ├── ContaBancaria.java
        └── Main.java

💻 Código Java
ContaBancaria.java
package br.com.dio.contabancaria;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido! Saldo insuficiente ou valor negativo.");
        }
    }
}

Main.java
package br.com.dio.contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Testando operações
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(400); // Saldo insuficiente
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}

▶️ Exemplo de Saída
Depósito de R$ 500.0 realizado com sucesso.
Saque de R$ 200.0 realizado com sucesso.
Saque inválido! Saldo insuficiente ou valor negativo.
Saldo atual: R$ 300.0

🛠 Como Executar
# Compilar
javac -d bin src/br/com/dio/contabancaria/*.java

# Executar
java -cp bin br.com.dio.contabancaria.Main
