fun main() {
    val palavra = "Universidade"
for (letra in palavra) {
       val letraMinuscula = letra.lowercaseChar()
  if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') { 
      continue   
        }
        print(letra)
    }
}