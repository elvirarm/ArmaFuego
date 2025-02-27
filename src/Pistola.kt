import kotlin.random.Random

class Pistola(nombre: String = "Pistola", municion: Int, municionARestar: Int = 1, tipoDeMunicion: TipoMunicion, danio: Int, radio : Radio) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion, danio, radio) {


    init{


        require(this.danio in 0..6){"El daño debe ser entre 1 y 5"}

        require(this.radio == Radio.Corto || this.radio == Radio.Reducido){"El radio debe ser corto o reducido"}
    }


    override fun dispara() {
        super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }

}