// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String ,  val nivel: Nivel,var conteudos: List<ConteudoEducacional> ) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Matrícula realizada para ${usuario.toString()} na formação $nome - Nível: $nivel.")
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin", duracao = 60)
    val conteudo2 = ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", duracao = 45)

    val formacao1 = Formacao("Aprendendo Kotlin na Prática", Nivel.BASICO, listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Praticando sua Lógica de Programação com Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1.copy(), conteudo2.copy()))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    formacao2.matricular(usuario1)
    formacao2.matricular(usuario2)
}
