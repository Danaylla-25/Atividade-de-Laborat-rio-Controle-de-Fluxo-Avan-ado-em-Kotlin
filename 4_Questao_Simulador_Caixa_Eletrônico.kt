fun main() {
    var saldo = 1000.00
    val valorSaque = 150.00

    println("--- Bem-vindo ao Caixa Eletrónico ---")
    while (true) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$ 150.00 efetuado. Saldo restante: R$ $saldo")
        } else {
            println("Saldo Insuficiente. Operação encerrada.")
            break
        }
    }
}