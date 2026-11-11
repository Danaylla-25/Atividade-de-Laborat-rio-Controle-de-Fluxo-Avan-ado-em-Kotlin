fun main() {
    val senhaCorreta = "2505"

    println("--- Sistema de Segurança do Cofre ---")
    for (tentativa in 1..5) {
        print("Tentativa $tentativa de 5. Digita a senha: ")
        val senhaDigitada = readlnOrNull()
          if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido! O cofre está aberto.")
            break
        } else {
            println("Senha incorreta!")
          if (tentativa == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}