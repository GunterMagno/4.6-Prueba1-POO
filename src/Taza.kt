class Taza(val color: Color = Color.blanco, var capacidad: Int = 50) {
    var cantidad :Int = 0
        set(cantidadAgregada){
            field = if (cantidad > capacidad){
                capacidad
            }else {
                cantidadAgregada
            }
        }

    fun llenar(){cantidad = capacidad}

    fun llenar(cantidadAgregada :Int){cantidad += cantidadAgregada}

    override fun toString(): String {
        return "Taza (color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c."
    }
}