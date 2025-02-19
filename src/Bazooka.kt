class Bazooka(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: TipoMunicion, danio: Int, radio : Radio) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion, danio, radio) {


    init{

        this.municionARestar = municion * 3

        require(this.danio in 10..31){"El daño debe ser entre 10 y 30"}

        require(this.radio == Radio.Intermedio || this.radio == Radio.Enorme  || this.radio == Radio.Amplio){"El radio debe ser intermedio, amplio o reducido"}
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