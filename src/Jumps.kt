fun main() {
    // Kotlin tem 3 formas de pular para determinadas partes do fluxo da aplicação
    // return, break e continue
    // todas essas expressões podem fazer parte de outras expressões

    //val nome = "Lucas" ?: return

    // Qualquer expressão no kotlin pode ser marcada por uma label
    // um break/continue/return pode ser qualificado por uma label

    externo@ for (i in 1..10) {
        for (x in 1..i) {
            if (i == 10) {
                if (x == 8) break@externo
            }
            print("$i ")
        }
        print("\n")
    }
    print("\n")

    // Um return marcado pode ser especialmente útil quando estamos usando lambdas
    fun batata() {
        val frita = setOf(1, 2, 3)
        frita.forEach {
            if (it == 3) return
            println("Batatinha frita: $it")
        }
        // Não é possível executar esse ponto de código apesar dele estar fora da lambda
        // Isso acontece pois o retorno de uma lambda não é explicito, não usa return
        // O retorno de uma lambda é o valor na sua última linha
        // Usar return dentro de uma lamba faz com a função afetada seja uma função normal ou expressão próxima
        println("Não dá para chegar aqui")
    }
    batata()

    // Aqui vamos para um exemplo com label
    fun couve() {
        val flor = setOf(1, 2, 3)
        flor.forEach nhamNhamVegetais@ {
            if (it == 3) return@nhamNhamVegetais
            println("Couve-flor: $it")
        }
        // Dessa vez essa parte do código será executada por conta de termos marcado a lambda como foco do return
        println("Dessa vez isso daqui será executado")
    }
    couve()
}