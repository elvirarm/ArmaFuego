import kotlin.random.Random

class Bazooka(nombre: String = "Bazooka de ejemplo", municion: Int = Random.nextInt(1,20), municionARestar: Int, tipoDeMunicion: TipoMunicion, danio: Int, radio : Radio) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion, danio, radio) {


    init{

        this.municionARestar = 3

        require(this.danio in 10..31){"El daño debe ser entre 10 y 30"}

        require(this.radio == Radio.Intermedio || this.radio == Radio.Enorme  || this.radio == Radio.Amplio){"El radio debe ser intermedio, amplio o reducido"}
    }


    override fun dispara() {
        super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }


}