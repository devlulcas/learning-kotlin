fun main() {
    val frutas = mutableMapOf<String, String>(
        "Laranja" to "Orange",
        "Uva" to "Grape",
        "Limão" to "Lemon",
        "Tomate" to "Tomato",
        "Banana" to "Banana",
        "Tangerina" to "Tangerine"
    )

    // Usamos in para passar por elementos de uma collection
    for (fruta in frutas) {
        println(fruta)
    }

    // Podemos verificar se um elemento existe assim também
    when {
        "Laranja" in frutas -> println("O Kel adora refrigerante de laranja")
        "Chocolate" in frutas -> println("Chocolate não é fruta")
        else -> {
            println("Coma frutas!")
        }
    }

    // Podemos usar o filter para retornar os valores quando a expressão resulta em true
    val frutasComPrimeiraLetraIgualNaTraducao =
        frutas.filter { (frutaEmPT, frutaEmEN) -> // Em maps temos que desestruturar o argumento em um Pair(chave, valor)
            frutaEmPT.first() == frutaEmEN.first()
        }
    // Outra coisa especial que rola em maps é que é possível usar filterKeys e filterValues

    for (fruta in frutasComPrimeiraLetraIgualNaTraducao) {
        println(fruta)
    }

    // Map
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8)

    fun Int.isEven(): Boolean {
        return this % 2 == 0
    }

    val numerosPar = numeros.map {
        numero ->
        if (numero.isEven()) numero else numero * 2
    }

    println(numerosPar)

    // PODEMOS PASSAR O RESULTADO DE CERTAS OPERAÇÕES PARA COLEÇÕES MUTÁVEIS UTILIZANDO O PÓS FIXO TO
    val frutasComL = mutableMapOf<String, String>()
    frutas.filterTo(frutasComL) {
        (key, value) ->
        key.startsWith("L")
    }

    frutasComL.forEach{(k,v) -> println("$k é $v")}

    // Sorting
    val listaDesordenada = listOf(1, 3, 2, 10, 4, 5, 12)
    // Sort altera a lista original
    // Sorted gera uma nova lista
    println(listaDesordenada.sorted())

    // Zip (como no python, junta os elementos de uma coleção com o de outra em pares (No Kt é literalmente um Pair()))
    val lista01 = listOf(1, 2, 3)
    val lista02 = listOf(3, 2, 1)
    println(lista01 zip lista02) // ((1, 3), (2, 2), (3, 1))

    // Associate
    // Permite criar mapas a partir da associação de valores como chave e valor
    val opcoes = listOf(0, 1, 2)
    val opcoesTexto = listOf("Entrar", "Sair", "Sobre")
    println( opcoes.associateWith { opcoesTexto[it] })

    // Flatten
    // Une arrays
    println(listOf(lista01, lista02, opcoes).flatten())

    // + e -
    // Criam uma nova coleção imutável com os valores da coleção anterior + ou - os novos itens
    val coisas = listOf(1, 2, 3)
    val maisCoisas = coisas + 4 + 5 + 6 + 7 + 8
    val menosCoisas = coisas - 1
    println("$coisas / $maisCoisas / $menosCoisas")

    // Agrupando com .groupBy() que recebe uma ou duas lambdas e gera um Map
    // Cada chave é o resultado da lambda e cada valor é seu correspondente na coleção
    val animais = listOf("Cachorro", "Macaco", "Gato", "Peixe", "Camarão", "Pato", "Galinha")
    val dicionarioDeAnimais = animais.groupBy { it.first() }
    println(dicionarioDeAnimais)

    // Tem mais coisa, mas aí eu que lute olhando a doc dnv depois
}
