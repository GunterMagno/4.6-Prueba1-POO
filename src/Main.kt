import kotlin.random.Random


fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina

    val cafetera1 = Cafetera("Sala",1000,0)
    val cafetera2 = Cafetera("Cocina",750)
    cafetera2.cantidad = 750
    val cafetera3 = Cafetera("Oficina")
    cafetera3.capacidad = 500
    cafetera3.cantidad = 200

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias

    val listaTazas = mutableListOf<Taza>()

    for (i in 1..20){
        val colores = Color.entries.toTypedArray()
        val color = when(Random.nextInt(0,colores.size+1)){
            1 -> colores[0]
            2 -> colores[1]
            3 -> colores[2]
            4 -> colores[3]
            5 -> colores[4]
            else -> {colores[0]}
        }

        val numero = Random.nextInt(1,4)
        when (numero) {
            1 -> {listaTazas.add(Taza(color,capacidad = 50))}
            2 -> {listaTazas.add(Taza(color,capacidad = 75))}
            3 -> {listaTazas.add(Taza(color,capacidad = 100))}
        }
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.

    fun mostrarCafeteras() {
        println(cafetera1)
        println(cafetera2)
        println(cafetera3)
    }

    mostrarCafeteras()

    for(taza in listaTazas){println(taza)}

    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.

    cafetera1.llenar()

    //TODO: Vaciar la cafetera2.

    cafetera2.vaciar()

    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.

    cafetera2.agregarCafe((cafetera2.capacidad/2))

    //TODO: Agregar 400 c.c. de café a la cafereta3

    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras

    mostrarCafeteras()

    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.

    for (taza in listaTazas){
        if(cafetera1.cantidad > 0) {cafetera1.servirTaza(taza)}
        else if(cafetera2.cantidad > 0) {cafetera2.servirTaza(taza)}
        else if(cafetera3.cantidad > 0){ cafetera3.servirTaza(taza)}
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.

    mostrarCafeteras()
    for(taza in listaTazas){println(taza)}

}