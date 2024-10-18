fun main() {
    val heroi1 = Heroi("Avião", "Embraer", "Voar", 85)
    val heroi2 = Heroi("Vidro", "Temperado", "Invisibilidade e Resistencia", 80)
    var heroi3 = Heroi("Flash", "Volociter", "Velocista", 95)

    println("Poder original do ${heroi3.nome}: ${heroi3.poder}")
    heroi3.poder = "Tempo"
    println("Novo poder do ${heroi3.nome}: ${heroi3.poder}")

    val equipe = Equipe(listOf(heroi1, heroi2, heroi3))
    equipe.listarHerois()

    val heroi4 = Heroi("Mago", "Ryze", "Magia", 99)
    val heroi5 = Heroi("Trovão", "Tesla", "Eletricidade", 100)
    equipe.adicionarHeroi(heroi4)
    equipe.adicionarHeroi(heroi5)
    
    equipe.listarHerois()

    equipe.removerHeroi(heroi1)
    equipe.listarHerois()

    val heroiVoador = HeroiVoador("Superman", "Clark Kent", "Voo", 95, 70)
    val heroiForca = HeroiForca("Hulk", "Bruce Banner", "Força Descomunal", 100, 80)
    val heroiTecnologico = HeroiTecnologico("Batman", "Bruce Wayne", "Tecnologia", 75, 60)

    heroiVoador.apresentar()
    heroiVoador.lutar()

    heroiForca.apresentar()
    heroiForca.lutar()

    heroiTecnologico.apresentar()
    heroiTecnologico.lutar()
}

class Equipe(private val heroisIniciais: List<Heroi>) {
    private val herois = heroisIniciais.toMutableList()

    fun adicionarHeroi(heroi: Heroi) {
        herois.add(heroi)
        println("${heroi.nome} foi adicionado à equipe!")
    }

    fun removerHeroi(heroi: Heroi) {
        if (herois.remove(heroi)) {
            println("${heroi.nome} foi removido da equipe!")
        } else {
            println("${heroi.nome} não foi encontrado na equipe!")
        }
    }

    fun listarHerois() {
        println("Heróis na equipe:")
        herois.forEach { println("- ${it.nome}") }
    }
}

open class Heroi(
    val nome: String,
    val identidadeSecreta: String,
    var poder: String,
    var forca: Int
) {
    open fun apresentar() {
        println("Eu sou o $nome, meu poder é $poder.")
    }

    open fun lutar() {
        println("$nome lutando com poder: $poder")
    }
}

class HeroiVoador(nome: String, identidadeSecreta: String, poder: String, forca: Int, var resistencia: Int)
    : Heroi(nome, identidadeSecreta, poder, forca) {

    override fun lutar() {
        resistencia = (resistencia * 0.9).toInt()
        println("$nome está voando enquanto luta com o poder: $poder. Resistência: $resistencia")
    }
}

class HeroiForca(nome: String, identidadeSecreta: String, poder: String, forca: Int, var resistencia: Int)
    : Heroi(nome, identidadeSecreta, poder, forca) {

    override fun lutar() {
        resistencia = (resistencia * 1.2).toInt()
        println("$nome usa força bruta com o poder: $poder. Resistência: $resistencia")
    }
}

class HeroiTecnologico(nome: String, identidadeSecreta: String, poder: String, forca: Int, var resistencia: Int)
    : Heroi(nome, identidadeSecreta, poder, forca) {

    override fun lutar() {
        resistencia = (resistencia * 1.05).toInt()
        println("$nome usa gadgets tecnológicos com o poder: $poder. Resistência: $resistencia")
    }
}
