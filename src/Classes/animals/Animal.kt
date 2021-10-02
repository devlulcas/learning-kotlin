package Classes.animals

// Para um classe ser herdada ela precisa ser Open
// Open não é compatível com Data
// Open permite a criação de objetos
/*
open class Animal(
    val vulgo: List<String>,
    val especie: String
)
*/

// Abstract é o contrato com o capirosco | Não gera objetos
abstract class Animal(
    val vulgo: List<String>,
    val especie: String
){
    abstract fun som() // Funções abstratas não possuem corpo ou expressão, só nome e parâmetros
}
