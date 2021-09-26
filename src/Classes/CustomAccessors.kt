package Classes

class CustomAccessors(
    val primeiroNome: String,
    val sobrenome: String,
    val idade: Int
) {
    val nomeCompleto = "$primeiroNome $sobrenome" //Acessado normalmente
    val podeBeber: String
        get() {
            return if (idade >= 18) "pode" else "não pode"
        }

    fun podeBeberFun(): String {
        return if (idade >= 18) "pode" else "não pode"
    }
}

fun main() {
    val custom: CustomAccessors = CustomAccessors("Lucas", "Alves Rego", 19)
    val nomeCompleto = custom.nomeCompleto
    val podeBeber1 = custom.podeBeber
    val podeBeber2 = custom.podeBeberFun()
    println("Comum = $nomeCompleto \nCom get = $podeBeber1\nCom fun = $podeBeber2")
}