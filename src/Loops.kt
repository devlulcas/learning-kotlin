fun main() {
    var cont = 0

    // Clássico while
    println("--WHILE--")
    while( cont < 10) {
        println(cont)
        cont ++
    }

    // Clássico do while
    println("--DO WHILE--")
    do {
        println(cont)
        cont --
    } while (cont > 0)

    // Break da massa = break
    while (cont < 100) {
        cont ++
        if (cont == 9) {
            break
        }
    }

    // For meio python e afins
    val hortifruti = listOf<String>("Abacaxi", "Banana", "Caqui", "Damasco", "Ervilha")
    println("--FOR IN LISTA STRING--")
    for (fruta in hortifruti) {
        println(fruta)
    }

    println("--FOR IN LISTA STRING INDEXES--")
    for (index in hortifruti.indices) {
        println(index)
    }

    println("--FOR IN LISTA INT--")
    for (n in 0..10) {
        println(n)
    }

    println("--FOR IN LISTA INT AO CONTRARIO--")
    for (x in 10 downTo 1) {
        println(x)
    }

    println("--FOR IN LISTA INT PULANDO 2--")
    for (y in 1..10 step 2) {
        println(y)
    }

    println("--FOR EACH--")
    hortifruti.forEach {
        fruta: String ->
        println(fruta)
    }
}