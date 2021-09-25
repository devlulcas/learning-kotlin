// Um programa Kotlin é rodado a partir desta função main
fun main() {
    // Variáveis podem ser declaradas com var e val
    // val => value => imutável
    // var => variable => mutável
    // Kotlin tem inferência de tipos, ou seja, você não precisa declarar o tipo se ele for óbvio. Ex:
    val name = "Lucas"
    // Kotlin também não te faz usar ponto e vírgula

    // Podemos especificar os tipos também. Em alguns casos você tem que pensar nisso a frente do tempo
    var idade: Int = 2021
    idade -= 2002
    // Println mostra coisas na tela
    println(idade)

    // Os tipos no Kotlin são estáticos e fortes
    // Não há conversão escondido de você
    // Passar um float para uma função que pede um double resultará em erros, por exemplo

    // Tipos númericos:
    // Integers
    val a: Byte // 1 byte
    val b: Short // 2 bytes
    val c: Int // 4 bytes
    val d: Long // 8 bytes
    val d2 = 1L // Long (O "L" define como Long na inferência de tipo mesmo que o valor inicial não chegue nos limites)
    // Floats
    val e: Float // 4 bytes
    val e2 = 2.7182818284f // Float (O "f" transformará esse valor de Double para Float)
    val f: Double // 8 bytes // Não adianta passar um inteiro para isso aqui que vai dar erro
    // Literal constants
    val g = 123 //Int —  Decimal
    val h = 0xFFAAFC // Int —  Hexadecimal
    val i = 0b01010101 // Int — Binário
    // Octais não são suportados
    val j = 100.1 // Double por padrão
    val k = 132.2e10 // Double — Notação convencional
    // Kotlin também permite que você utilize _ para separar números o que facilita a leitura
    val l = 100_000_000 // Um milhão
}