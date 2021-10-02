package Classes.animals

class Cachorro(
    val raca: String
) : Animal(
    especie = "Canis lupus familiaris",
    vulgo = listOf("Cachorro", "Cão")) {

    fun latir() {
        println("Au Au")
    }
}