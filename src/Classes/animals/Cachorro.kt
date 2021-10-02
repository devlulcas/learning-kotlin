package Classes.animals

class Cachorro(
    val raca: String
) : Animal(
    especie = "Canis lupus familiaris",
    vulgo = listOf("Cachorro", "Cão")
) {

    // Sobrescreve a função abstrata da classe base
    override fun som() {
        println("Au Au")
    }
}