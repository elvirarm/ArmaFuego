class Rifle(nombre: String = "Rifle", municion: Int, municionARestar: Int = 2, tipoDeMunicion: TipoMunicion, danio: Int, radio : Radio) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion, danio, radio) {


    init{


        require(this.danio in 5..11){"El daño debe ser entre 5 y 10"}

        require(this.radio == Radio.Corto || this.radio == Radio.Intermedio){"El radio debe ser corto o reducido"}
    }


    override fun dispara() {
        super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }


}