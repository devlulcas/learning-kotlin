fun main() {
    // O Kotlin dá suporte as operações de sempre
    // + - * / %
    // O Kotlin também dá suporte à operator overloads. Veja: https://kotlinlang.org/docs/operator-overloading.html
    val a = 10 / 3 // Resulta em 3. A divisão de dois inteiros resulta em inteiro, então o ".3" é descartado
    val b = 10.0 / 3 // Resulta em 3.3...
    println(a)
    println(b)

    // As operações de comparação também são as de sempre
    // == != >= <=

    // Mas também temos extras:
    // Checando se um número está num range:
    // x in 1..10 // x in a..b
    // Negação da operação anterior:
    // x !in 1..10 // x!in a..b

    // Peculiaridades:
    // -0.0 < 0.0 // true // No JS isso é false
    // NaN == NaN // true // No JS isso é false
}