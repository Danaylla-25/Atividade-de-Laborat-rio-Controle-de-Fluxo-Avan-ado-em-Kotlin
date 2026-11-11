fun main() {
    println("Iniciando a corrida de obstáculos (1 a 50):")

    for (numero in 1..50) {
        if (numero % 10 == 7) {
            continue 
        }
        println(numero)
    }
}