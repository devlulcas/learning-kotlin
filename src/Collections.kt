fun main() {
    // Tuplas Pair e Triple
    val coord = Pair(1, 3)
    val coord3d = Triple(1, 4, 8)
    // Ranges -> Iteráveis
    val range = 1..10 // 1, 2, 3 ... 10
    val rangeExcluiUltimo = 1 until 10 // 1, 2, 3 ... 9
    val rangePula = 1..10 step 2
    val rangeInverso = 10 downTo 1
    // Contains / Includes => in | Podemos negar o resultado => !in
    val noveEstaEmFalta = 9 !in 1..8

    // Collections de verdade
    // Kotlin implementa por padrão três tipos básicos de collections:
    // sets, lists e maps


    // COLLECTION<T> é a “interface” base de todas as coleções básicas.
    // Uma collection possui todas as operações básicas de uma coleção imutável
    fun printTodos(stringsCollection: Collection<String>) {
        stringsCollection.forEach { println(it) }
    }

    // Já uma MutableCollection possui a base para operações mutáveis
    fun addTodos(stringsCollection: MutableCollection<String>, strings: Collection<String>) {
        strings.forEach { stringsCollection.add(it) }
    }

    val listString = listOf<String>("kotlin", "e", "suas", "coleções")
    val setString = setOf<String>("kotlin", "e", "suas", "coleções", "mutáveis")

    printTodos(listString)
    printTodos(setString)

    // LIST<T> armazena um elemento numa ordem específica. Lists tem um comportamento de índices de uma array comum
    // 0 .. list.size -1
    // Lists podem possuir elementos duplicados (pois o índice é númerico e depende da ordem de inserção)
    // Lists podem possuir espaços vazios
    // Duas listas são iguais se ambas possuírem o mesmo tamanho e elementos iguais na mesma ordem
    val listaImutavel: List<Int> = listOf(1, 2, 3, 4, 5)
    val listaMutavel: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    // A implementação de uma lista em Kotlin é um arraylist -> Uma lista dinâmica
    val arraylist: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)

    // Temos vários exemplos de como trabalhar com listas:
    listaMutavel.add(6)
    listaMutavel.removeAt(0)
    var daNaMesma = listaMutavel[4] == listaMutavel.elementAt(4)  // Acesso
    listaMutavel[2] = 10

    // SET<T> armazena um elemento único, incluindo nulos (pode haver apenas um nulo).
    // Dois sets são iguais se possuem o mesmo tamanho e os mesmos elementos 1 para 1 (independente de ordem)
    val set: Set<Int> = setOf(1, 2, 3)
    val setInvertido: Set<Int> = setOf(3, 2, 1)
    println(set == setInvertido)

    // MutableSet<T> é um Set<T> mutável.
    // Na implementação padrão de um Set<T> é usado uma estrutura de dados chamada LinkedHashSet que preserva a ordem
    // de inserção dos elementos. Dessa forma um set.first() obtém um resultado previsível.
    // Outra implementação usa um HashSet. Essa não se importa com a ordem, então alguns métodos de Collection<T> são
    // imprevisíveis e inconstantes, mas usa menos memória.

    // MAP<T> não descende de COLLECTION<T>.
    // Maps armazenam valorem em pares de chave e valor. Chaves devem ser únicas, mas chaves diferentes podem possuir
    // o mesmo valor.
    // Maps são implementados por padrão com LinkedHashMap. Mantendo assim a ordem de inserção dos elementos.
    val mapa: Map<Int, String> = mapOf(
        1 to "Janeiro",
        2 to "Fevereiro",
        3 to "Março",
        4 to "Abril",
        5 to "Maio",
        6 to "Junho",
        7 to "Julho",
        8 to "Agosto",
        9 to "Setembro",
        10 to "Outubro",
        11 to "Novembro",
        12 to "Dezembro"
    )
    // Um MutableMap possui as operações de modificação do Map.
    val datasDeAniversario = mutableMapOf<String, String>(
        "01/01/1900" to "João"
    )

    datasDeAniversario.put("03/05/1920", "Paula")
    datasDeAniversario["03/03/1982"] = "Pedro"

    println(datasDeAniversario)


    // Usando to para criar elementos num map nós criamos um Pair() temporário, em sistemas de performance restrita use:
    val mapaPerformance = mutableMapOf<String, Int>()
    mapaPerformance.apply {
        this["Zero"] = 0
        this["Um"] = 1
    }
}
