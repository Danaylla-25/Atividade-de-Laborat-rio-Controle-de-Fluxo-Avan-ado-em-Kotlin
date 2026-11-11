fun main() {
    while (true) {
        println("\n--- Menu Teimoso ---")
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("3 - Opção 3 (Manutenção)")
        println("0 - Sair")
        print("Escolha uma opção: ")

        val opcao = readlnOrNull()?.toIntOrNull()
        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        } 
        else if (opcao == 3) {
            println("Módulo em manutenção")
            continue 
        } 
        else if (opcao == 0) {
            println("A encerrar o sistema. Adeus!")
            break 
        } 
        else {
            println("Opção inválida. Tenta novamente!")
        }
        
    }
}