fun main() {
    val palavra = "Universidade"
    // O laço 'for' percorre cada letra da string
for (letra in palavra) {
    // Converte temporariamente para minúscula para facilitar a verificação
    val letraMinuscula = letra.lowercaseChar()

    // Se a letra for uma vogal, o 'continue' entra em ação
  if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') { 
      // O 'continue' aborta esta volta e passa imediatamente para a próxima letra
      continue   
        }
       // Se não for vogal, o código chega até aqui e imprime a consoante
        print(letra)
    }
}
