
fun main() {

    val pistola = Pistola("Pistola de ejemplo", 10, 3, TipoMunicion.CalibreMM9, 5, Radio.Corto)

    val rifle = Rifle("Rifle de ejemplo", 20, 15, TipoMunicion.CalibreMM7_62, 9, Radio.Intermedio)


    val bazooka = Bazooka("Bazooka de ejemplo", 3, 2, TipoMunicion.RPG, 10, Radio.Enorme)

    val listaArmas: MutableList<ArmaDeFuego> = mutableListOf(pistola, rifle, bazooka)

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")


    fun generarMapa(listaArmas: MutableList<ArmaDeFuego>): MutableMap<Int, ArmaDeFuego>{

        val mapaDisparos = mutableMapOf<Int, ArmaDeFuego>()

        for (i in 1..12){
            mapaDisparos[i] = listaArmas.random()
        }

        return mapaDisparos
    }

    fun recorrerDisparos(mapaDisparos: MutableMap<Int, ArmaDeFuego>){
        for (arma in mapaDisparos.values){
            println(arma)
            arma.dispara()
            println("---------------------------------------------------------")
        }

        }

    val mapaDisparos = generarMapa(listaArmas)

    recorrerDisparos(mapaDisparos)
    }