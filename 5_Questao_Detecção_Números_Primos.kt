fun main() {
    val alvo = 59
    var ehPrimo = true 

    for (divisor in 2 until alvo) {
        if (alvo % divisor == 0) {
            ehPrimo = false
            break 
        }
    }
    if (ehPrimo) {
        println("O número $alvo É PRIMO!")
    } else {
        println("O número $alvo NÃO é primo.")
    }
}