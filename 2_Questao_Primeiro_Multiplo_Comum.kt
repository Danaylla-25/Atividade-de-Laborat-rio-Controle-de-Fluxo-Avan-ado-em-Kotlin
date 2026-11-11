fun main() {
   var numero = 1
 while (true) {
      if (numero % 7 == 0 && numero % 13 == 0) {
            println("O primeiro múltiplo comum entre 7 e 13 é: $numero")
          break
        }
       numero++
    }
}