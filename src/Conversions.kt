fun main() {
    // Conversões no Kotlin devem ser EXPLÍCITAS

    // Todos os números são conversíveis para estes tipos:
    val n = 100
    n.toByte()   //: Byte
    n.toShort()  //: Short
    n.toInt()    //: Int
    n.toLong()   //: Long
    n.toFloat()  //: Float
    n.toDouble() //: Double
    n.toChar()   //: Char

    // O mais próximo de uma conversão explícita é o caso onde a inferência de tipo rola:
    val x = 1L + 123 //: Long
}