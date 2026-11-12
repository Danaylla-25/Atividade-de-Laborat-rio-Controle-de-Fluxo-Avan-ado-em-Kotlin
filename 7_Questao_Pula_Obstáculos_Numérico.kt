fun main() {
    println("Iniciando a corrida de obstáculos (1 a 50):")

    for (numero in 1..50) {

        /* Qualquer número dividido por 10 tem como 'resto' o seu último dígito.
         Exemplo: 27 / 10 dá 2, e sobram 7.*/ 
        if (numero % 10 == 7) {
            // Se terminar em 7, o 'continue' faz o laço saltar este número e não o imprime
            continue 
        }
        // Se não terminar em 7, o código passa pelo if e imprime o número normalmente
        println(numero)
    }
}
