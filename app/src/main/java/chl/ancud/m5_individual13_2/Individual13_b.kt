package chl.ancud.m5_individual13_2


data class Heroe(
    val superHero: String,
    val publisher: String,
    val realName: String,
    var photo: String
)

/// Parte B
fun main() {

    var cant: Int = 1

    var heroes = mutableListOf<Heroe>()

    while (cant == 1) {
        print("Nombre: ")
        var nombre = readln()
        print("Publisher: ")
        var publisher = readln()
        print("Nombre Real: ")
        var realName = readln()
        print("Foto: ")
        var photo = readln()

        heroes.add(Heroe(nombre, publisher, realName, photo))

        print("Ingrese 1 para seguir: ")
        cant = readln().toInt()
    }

    for (h in heroes) {
        println(h)
    }
}

