fun main() {
    /* O Kotlin possui condicionais comuns e algumas especiais
     * além de ter formas diferentes de criar algumas condicionais
     * */

    // true e false
    val verdade: Boolean = true
    val falso: Boolean = false

    // Operadores lógicos => > >= < <= == != || && !

    // Os operadores > >= < <= valem para chars e strings e contam com a ordem alfabética das letras para se decidir
    val comparandoOrdemString = "kotlin" > "java"
    println(comparandoOrdemString) // true pois  a, b, c , d , e, f, *J* , *K*, l, m... K vem depois de J

    // IF / ELSE comum
    if (true) {
        println("Entrou aqui")
    } else {
        println("Não entrou aqui")
    }

    // IF / ELSE expression
    val entrouOnde = if (true || false) "Entrou aqui" else "Não entrou aqui"

    // IF / ELSE IF / ELSE - Essa estrutura também pode ser usada como no exemplo anterior
    if (verdade == falso) {
        println("Aqui não entra")
    } else if (verdade || falso) {
        println("Aqui entra")
    } else {
        println("Aqui não entra")
    }

    // WHEN (UM TIPO DE SWITCH CASE?)
    val variable: Any = 1
    when(variable) {
        1 -> println("Um")
        2 -> println("Dois")
        3 -> println("Três")
        4 -> println("Quatro")
        5, 6 -> println("Cinco ou seis")
        in 7..9 -> println("Entre sete e nove")
        is Int -> println("É um double")

        else -> {
            println("Não sei contar")
        }
    }
}