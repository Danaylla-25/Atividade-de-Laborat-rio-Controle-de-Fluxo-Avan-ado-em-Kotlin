fun main() {
    val senhaCorreta = "2505" //essa é a senha correta

    println("--- Sistema de Segurança do Cofre ---")
    // O laço permite um máximo de 5 tentativas
    for (tentativa in 1..5) {
        print("Tentativa $tentativa de 5. Digita a senha: ")
       // serve para capturar a senha que vai ser digitada, quando o programa estiver sendo testado
        val senhaDigitada = readlnOrNull()
        // Verifica se a senha está correta
          if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido! O cofre está aberto.")
            // O break desliga o laço porque foi digitado a senha certa
            break
        } else {
            println("Senha incorreta!")
            // Verifica se esta foi a 3ª tentativa falhada
          if (tentativa == 3) {
                println("Cofre travado administrativamente")
                // O break bloqueia o sistema, impedindo que o laço chegue às tentativas 4 e 5
                break
            }
        }
    }
}
