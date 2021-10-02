package Classes.animals

fun main() {
    val aladim = Cachorro("Shih tzu")
    aladim.som()
    //val gato = Animal(listOf("Gato"), "Felis catus") // Isso é possível se a classe Animal é open

    // Não podemos criar objetos, mas podemos criar uma classe anonima temporaria
    val pato = object : Animal(listOf("Pato"), "Anas platyrhynchos") {
        override fun som() {
            println("Quack quack quack")
        }
    }

    pato.som()


}