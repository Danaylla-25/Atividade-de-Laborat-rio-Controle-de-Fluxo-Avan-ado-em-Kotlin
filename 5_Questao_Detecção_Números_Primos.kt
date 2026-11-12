fun main() {
    val alvo = 59
    // Parte do princípio de que o número é primo até que se prove o contrário
    var ehPrimo = true 
    
   // O 'until' serve pra criar um intervalo que vai de 2 até 'alvo - 1'
    for (divisor in 2 until alvo) {
        // Verifica se a divisão é exata (resto igual a zero)
        if (alvo % divisor == 0) {
            ehPrimo = false // Se dividiu exato, não é primo
           /* O break serve para aborta o laço imediatamente.
             Se o número alvo for 100 e dividiu por 2, não faz sentido testar o 3, 4, 5...*/
            break 
        }
    }
    // Exibe o resultado com base no que o laço descobriu
    if (ehPrimo) {
        println("O número $alvo É PRIMO!")
    } else {
        println("O número $alvo NÃO é primo.")
    }
}
