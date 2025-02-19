import kotlin.random.Random

class ArmaDeFuego (val nombre: String, var municion: Int, val municionARestar: Int, val tipoDeMunicion: TipoMunicion, val danio: Int, val radio: Radio) {

    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5, 16)
    }

    fun dispara(){
        municion -= municionARestar
        println()
    }

    fun recarga(){

    }

    fun mostrarInfo(){
        println("Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio)")
    }


}