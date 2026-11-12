fun main() {
    var total = 0
    // Iteração de 1 a 100
     for (numero in 1..100) {
         // Se o número for múltiplo de 10 (resto da divisão por 10 for igual a 0)
        if (numero % 10 == 0) {
            // Ignora este número e passa para o próximo
           continue
        }
        // Soma o número atual ao total
        total += numero //Ele serve para adicionar um valor e atualizar a variável ao mesmo tempo.
         
         // Verifica se a carga ultrapassou o limite de 500
        if (total > 500) {
            println("Carga limite atingida! Abortando no número $numero.")
            // Quebra o laço imediatamente
         break
        }
    }
    
    println("O valor final do total é: $total")
}
