enum class TipoMunicion(val descripcion: String) {

    CalibreMM9("9 mm"), CalibreMM7_62("7,62 mm"), CalibreMM60("60 mm"), RPG ("RPG");

    override fun toString(): String {
        return descripcion
    }
}