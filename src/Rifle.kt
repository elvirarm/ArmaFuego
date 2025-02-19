class Rifle(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: TipoMunicion, danio: Int, radio : Radio) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion, danio, radio) {


    init{

        this.municionARestar = municion * 2

        require(this.danio in 5..11){"El daño debe ser entre 5 y 10"}

        require(this.radio == Radio.Corto || this.radio == Radio.Intermedio){"El radio debe ser corto o reducido"}
    }


    override fun dispara() {
        super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
    }
}