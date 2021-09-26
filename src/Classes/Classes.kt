package Classes

/*
* # CLASSES E CONSTRUTORES PRIMÁRIOS
*
* Definimos uma classe com a palavra chave class - OBS: CamelCase
* Podemos ver também que colocamos parâmetros na classe como se fosse uma função.
* ## O que estamos fazendo é criar um construtor primário. Outra forma de alcançar o mesmo resultado é assim:
*
* >>> class Nome constructor(param: Type){}
* >>> class Nome(param: Type){}
*
* ## O construtor primário não deve ter nenhum código. Quaisquer códigos necessários durante a criação de um objeto desta
* classe devem ser colocados no inicializador:
*
* >>> class Nome constructor(param: Type) { init {} }
*
* ## Podemos também definir um valor padrão para uma variável no construtor primário:
*
* >>> class Nome(param: Type = "value") { init {} }
*
* ## Se forem muitas propriedades você pode quebrar a linha para melhor leitura do código:
*
* >>> class Nome(
* >>>    param1: Type = "value"
* >>>    param2: Type = "value"
* >>>    param3: Type = "value"
* >>> ) { init {} }
*
* ## Podemos mudar também a visibilidade do construtor da classe como um todo, quando fazemos isso é necessário o uso da
* palavra constructor:
*
* >>> class Nome internal constructor(param: Type) { init {} }
*
* Nesse caso o construtor da classe será visível apenas dentro do mesmo módulo.
*
* Módulo = Um conjunto de arquivos Kotlin compilados juntos
* */
class Classes(
    var parametro: String,
    var outroParametro: Int = 5,
    val maisUmParametro: Float
) {
    // Propriedades e inits podem ser colocados em sequência e a ordem em que vão ser executados quando a classe
    // for instanciada é a mesma que está no código.
    val propriedade = "Esta é uma propriedade. Este é um parâmetro: $parametro".also(::println)

    // Um inicializador é rodado quando uma classe é instanciada.
    init {
        println("Inicializador 01")
    }

    val propriedade2 = "Esta é uma outra propriedade. Este é um parâmetro: $outroParametro".also(::println)

    // É possível ter múltiplos inicializadores
    init {
        println("Inicializador 02")
    }
}

fun main() {
    val fon: Classes = Classes(
        "frocs",
        420,
        maisUmParametro = 1f
    )
    println(fon)
    println(fon.parametro)
    println(fon.outroParametro)
    println(fon.maisUmParametro)

    // Resultado =>
    /*
    * Esta é uma propriedade. Este é um parâmetro: frocs
    * Inicializador 01
    * Esta é uma outra propriedade. Este é um parâmetro: 420
    * Inicializador 02
    * Classes.Classes@58ceff1
    * frocs
    * 420
    * 69.69
    * */
    // Observações sobre a saída =>
    /*
    * A primeira parte da saída (Até "Inicializador 02") é fruto da criação da classe (inits e props)
    * Depois dessa primeira partes temos o resultado "Classes.Classes@58ceff1", este é um identificador do nosso objeto
    * Em seguida vemos as propriedades sendo mostradas sem getters. No Kotlin o acesso a propriedades é assim mesmo.
    *
    * Veja os exemplos das comparações das classes "PessoaJava" e "PessoaKotlin" e verá melhor como acontece.
    * Obs: Essas duas classes são idênticas.
    * */
}