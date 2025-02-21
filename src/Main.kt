import java.awt.event.ComponentAdapter

fun main() {

    val pistola = Pistola( municion = 10, tipoDeMunicion =  TipoMunicion.CalibreMM9, danio = 5, radio = Radio.Corto)

    val rifle = Rifle( municion = 20, tipoDeMunicion = TipoMunicion.CalibreMM7_62, danio = 9, radio = Radio.Intermedio)


    val bazooka = Bazooka(municion = 3, tipoDeMunicion =  TipoMunicion.RPG, danio = 10, radio = Radio.Enorme)

    val listaDispara: MutableList<dispara> = mutableListOf(pistola, rifle, bazooka, Coche(), Casa(), Bocadillo())

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")


    fun generarMapa(listaDispara: MutableList<dispara>): MutableMap<Int, dispara>{

        val mapaDisparos = mutableMapOf<Int, dispara>()

        for (i in 1..9){
            mapaDisparos[i] = listaDispara.random()
        }

        return mapaDisparos
    }



    fun recorrerDisparos(mapaDisparos: MutableMap<Int, dispara>){
        var contador = 1
        for (arma in mapaDisparos.values){
            println("*** Disparo: $contador")
            println(arma)
            arma.dispara()
            println("---------------------------------------------------------")
            contador += 1
        }

        }

    val mapaDisparos = generarMapa(listaDispara)

    recorrerDisparos(mapaDisparos)
    }