fun main() {
    // Declaração do saldo inicial como variável mutável
    var saldo = 1000.00
    val valorSaque = 150.00

    println("--- Bem-vindo ao Caixa Eletrónico ---")
    // O laço infinito é criado para simular operações contínuas
    while (true) {
        // Verifica se há dinheiro suficiente para o saque
        if (saldo >= valorSaque) {
            saldo -= valorSaque // Isso é um operador de atribuição de subtração, ele deduz o valor do saque
            println("Saque de R$ 150.00 efetuado. Saldo restante: R$ $saldo")
        } else {
            // Se o saldo for menor que 150, não permite o saque
            println("Saldo Insuficiente. Operação encerrada.")
            // Desliga o caixa eletrónico, sai do laço infinito
            break
        }
    }
}
