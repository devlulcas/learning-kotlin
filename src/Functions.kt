import kotlin.math.sqrt

// A estrutura de uma função não muda muito do que já estamos acostumados
// Essa é a estrutura base de uma função kotlin:
fun soma(primeiroNumero: Int = 0, segundoNumero: Int = 0): Int {
    return primeiroNumero + segundoNumero
}

//Função sem parâmetro de entrada e sem saída:
fun main() {
    println(soma(5, 6))
}

/*

## Parâmetro vs Argumentos

**Parâmetro** : O que vem entre parâmetros na declaração da função.
```kt
fun elevarAoQuadrado(num: Int): Long {
	val resultado = num * num
	return resultado.toLong()
}
```

**Argumento** : O que é passado na chamada da função.
```kt
fun main() {
	val resultado = elevarAoQuadrado(5)
	println(resultado)
}
```


## Expressão vs Declaração
**Expressão** : Possui valor próprio.
Ex (if no retorno):
```kt
fun maiorNumero(primeiroNum: Int, segundoNum: Int): Int {
	return if (primeiroNum > segundoNum) primeiroNum else segundoNum
}
```

**Declaração** : Não possui valor próprio.
No Java o If é uma declaração, não possui valor próprio.

O código anterior em java teria que possuir um return dentro dos ifs e não ao contrário como acontece em Kotlin.


### No Kotlin a maioria das estruturas de controle de fluxo são expressões, exceto as estruturas de repetição.

### Uma função Kotlin possui corpo de bloco quando tem seu return entre parentêses.
Nesses casos é necessário usar a declaração **return**

### Quando a função consiste de apenas uma expressão ela possui um corpo de expressão
Por exemplo:
```kt
fun soma(primeiroNum: Int, segundoNum: Int) = primeiroNum + segundoNum
```

* */