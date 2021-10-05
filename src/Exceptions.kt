fun main() {
    // Try catch error handling
    // Todas as exceptions do kotlin herdam a classe Throwable
    // Toda exceção possui uma mensagem, um stack trace e uma causa opcional
    val lista = listOf(0, 1 , 2, 3)

    // Tente fazer isso, caso dê errado capture o erro e faça tal coisa
    try {
        println(lista[5]) // lista.size = 4 logo 5 não é um índice válido
    } catch (e: Exception) {
        println("Não é possível alcançar tal índice, tente novamente com um número que vá de 0 até ${lista.size}")
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
    }

    // Um try deve possui obrigatoriamente um catch ou finaly. Obs: try é uma expression
    println("\n\n\n")
    val abc = try {
        "abc".toInt()
    } catch (e: Exception) {
        println(e)
        123
    } finally {
        println("É isto. Isso aqui é executado no fim.")
    }

    println(abc)
}