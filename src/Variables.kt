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
}