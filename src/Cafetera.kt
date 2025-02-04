class Cafetera(val ubicacion: String) {
    var capacidad: Int = 1000
    var cantidad: Int = 0

    constructor(ubicacion: String,capacidad: Int): this(ubicacion){
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    constructor(ubicacion: String,capacidad: Int,cantidad: Int): this(ubicacion){
        if(cantidad > capacidad){
            this.cantidad = capacidad
        }
    }

    fun llenar(){cantidad = capacidad}
    fun vaciar(){cantidad = 0}

    fun servirTaza(taza: Taza){
        if (cantidad < taza.capacidad){
            taza.cantidad += cantidad
            cantidad = 0

        }else if (cantidad > taza.capacidad){
            taza.cantidad = taza.capacidad
            cantidad -= taza.cantidad
        }
    }

    fun agregarCafe(cantidadAgregada: Int = 200){
        if (cantidadAgregada + cantidad > capacidad){
            cantidad = capacidad
        }else{
            cantidad += cantidadAgregada
        }
    }

    override fun toString(): String {
        return "Cafetera (ubicacion = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}