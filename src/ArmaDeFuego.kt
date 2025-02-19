import kotlin.random.Random

abstract class ArmaDeFuego (protected val nombre: String, protected var municion: Int, protected var municionARestar: Int, protected val tipoDeMunicion: TipoMunicion, val danio: Int, val radio: Radio) {

    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5, 16)
    }

    open fun dispara() {

        municion -= municionARestar
        println("Se ha disparado $nombre, queda $municion")
        if (municion < municionARestar) {
            recarga()
            dispara()
        }
    }

    open fun recarga(){

        if (cantidadMunicionExtra >= municionARestar * 2) {
            municion += municionARestar * 2
            cantidadMunicionExtra -= municion
            println("Se ha recargado $nombre, queda $municion")

        }else if (cantidadMunicionExtra >= municionARestar){
            municion += municionARestar
            cantidadMunicionExtra -= municion
            println("Se ha recargado $nombre, queda $municion")


        }else{
            println("No hay suficiente munición extra para recargar.")
        }

    }



    open fun mostrarInfo()
    {
        println("Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio)")
    }


}