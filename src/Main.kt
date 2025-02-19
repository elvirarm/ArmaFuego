
fun main() {

    val pistola = Pistola("Pistola de ejemplo", 10, 3, TipoMunicion.CalibreMM9, 5, Radio.Corto)

    val rifle = Rifle("Rifle de ejemplo", 20, 15, TipoMunicion.CalibreMM7_62, 9, Radio.Intermedio)


    val bazooka = Bazooka("Bazooka de ejemplo", 20, 23, TipoMunicion.RPG, 22, Radio.Amplio)

    var listaArmas: MutableList<ArmaDeFuego> = mutableListOf(pistola, rifle, bazooka)

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")





}