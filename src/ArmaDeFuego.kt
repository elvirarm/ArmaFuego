import kotlin.random.Random

abstract class ArmaDeFuego (protected val nombre: String, protected var municion: Int, protected var municionARestar: Int, protected val tipoDeMunicion: TipoMunicion, val danio: Int, val radio: Radio) {

    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5, 16)
    }

    open fun dispara() {


        if (municion < municionARestar) {
            recarga()
        }

        if (municion < municionARestar) {
            println("No se puede disparar")
        }else {
            municion -= municionARestar
            println("Se ha disparado $nombre, le quedan $municion balas al arma y $cantidadMunicionExtra en la caja de munición")
        }
    }

    open fun recarga(){

        val mensajeRecarga = "Se ha recargado $nombre, le quedan $municion balas al arma y $cantidadMunicionExtra en la caja de munición"

        if (cantidadMunicionExtra >= municionARestar * 2) {
            municion += municionARestar * 2
            cantidadMunicionExtra -= municionARestar * 2
            println(mensajeRecarga)

        }else if (cantidadMunicionExtra >= municionARestar){
            municion += municionARestar
            cantidadMunicionExtra -= municionARestar
            println(mensajeRecarga)

        }else if (cantidadMunicionExtra + municion >= municionARestar) {
            municion += cantidadMunicionExtra
            cantidadMunicionExtra = 0
            println(mensajeRecarga)
        }
        else{
            println("No hay suficiente munición extra para recargar. Quedan $cantidadMunicionExtra")
        }

    }

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio)"
    }



}