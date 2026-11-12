fun main() {
   // Começa a testar a partir do número 1
   var numero = 1
   // Cria um laço infinito. Ele vai rodar até que um 'break' o pare.
 while (true) {
    // Verifica se o resto da divisão (%) por 7 e por 13 é igual a zero
      if (numero % 7 == 0 && numero % 13 == 0) {
            println("O primeiro múltiplo comum entre 7 e 13 é: $numero")
            // Como ele encontra o número, se usa o 'break' para destruir o laço infinito
          break
        }
      // Se não for múltiplo de ambos, incrementa o número (+1) para testar o próximo na volta seguinte
       numero++
    }
}
