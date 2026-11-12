fun main() {
    // Laço infinito para manter o menu sempre a aparecer até que seja encerrado no 0
    while (true) {
        println("\n--- Menu Teimoso ---")
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("3 - Opção 3 (Manutenção)")
        println("0 - Sair")
        print("Escolha uma opção: ")
        
        // Lê o que é digitado e converte para número inteiro
        val opcao = readlnOrNull()?.toIntOrNull()
        // Avalia as condições exigidas no exercício
        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        } 
        else if (opcao == 3) {
            println("Módulo em manutenção")
            // O continue faz o programa ignorar tudo o que estiver abaixo e volta a desenhar o menu instantaneamente
            continue 
        } 
        else if (opcao == 0) {
            println("A encerrar o sistema. Adeus!")
            // O break desliga o laço infinito e o programa termina
            break 
        } 
        else {
            println("Opção inválida. Tenta novamente!")
        }
        // Se escolher 1 ou 2, o código chega aqui de forma natural e depois o laço recomeça.
        // Se escolher 3, o continue impede que o código chegue sequer a esta linha.
    }
}
