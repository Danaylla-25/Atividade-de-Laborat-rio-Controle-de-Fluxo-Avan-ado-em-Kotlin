fun main() {
    var total = 0
     for (numero in 1..100) {
        if (numero % 10 == 0) {
           continue
        }
        total += numero
        if (total > 500) {
            println("Carga limite atingida! Abortando no número $numero.")
         break
        }
    }
    
    println("O valor final do total é: $total")
}