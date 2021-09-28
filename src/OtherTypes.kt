fun main() {
    // O Kotlin possui os tipos que vimos no arquivo Variables.kt, mas também possui mais alguns
    val nome: String = "Lucas" // Strings usam aspas duplas
    val letra: Char = 'a' // Chars usam aspas simples
    val verdade: Boolean = true
    // Outros tipos peculiares são o "Any", "Unit" e "Nothing"

    // Any -> Aceita qualquer coisa, assim como no TS
    val tantoFaz: Any = "que tipo de typescript é este?"

    // Unit -> Utilizado em funções que não retornam e nem recebem nada, todas as funções assim são Unit
    fun dizOi(): Unit = println("Oi")

    // Nothing -> Utilizado em funções que rodam eternamente
    fun loopInfinito(): Nothing {
        while (true) {
            println("IHAAA")
        }
    }
}