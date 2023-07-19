package com.example.myapplicationhabr

class Arrays {
}

fun main() {
/*
    //Creacion De Un Array
    val mascotas= arrayOf("Dog","Cat","Canary")

    //Imprimir un Array
    println(mascotas.contentToString())

    //acceso a una posicion
    println(mascotas[1])

    //modificar valor de una posicion
    mascotas[2]="Parrot"

    println(mascotas.contentToString())

    //Recorrer Todos Los Elementos De Un Array
    for (e in mascotas){
        println("La Mascota Es: $e")
    }

    //Imprimir Elemento y Index

    for ((i,e) in mascotas.withIndex()){
        println("La Mascota Es: $e Y El Numero Es $i")
    }
*/

    //<----------------------------Listas---------------------------->
// Listas No Mutables
    var instruments= listOf("Trumpet","Piano","Violin")
    println(instruments)

    val instrumentos:List<String> =listOf("Trumpet","Piano","Violin")
    println(instrumentos)

//Lista Mutable
    val instrumentos2= mutableListOf("Trumpet","Piano","Violin")

    instrumentos2[1]="Saxofon"
    println(instrumentos2)

    //Primer Y Ultimo Valor De La Lista
    val Primerlemento=instrumentos2.first()
    val SegundoElemento=instrumentos2.last()

    println("El Primer Elemento Es: $Primerlemento")
    println("El Segundo Elemento Es: $SegundoElemento ")

    //Agregar Elementos A Una Lista

    instrumentos2.add("Guitar")
    instrumentos2.add("Drummer")

    println(instrumentos2)

    //Eliminar Elemento De La Poscision Dada Y Quitar Elementos De Una Lista A Través Del Index
    instrumentos2.removeAt(2)

    //Eliminar Varios Elementos

    instrumentos2.removeAll(listOf("Guitar","Drummer"))
    println(instrumentos2)


//Error Al Eliminar Un Elemento No Existente
  //  instrumentos2.removeAt(8)


    //Elimina La Lista Completa

    instrumentos2.clear()

    println(instrumentos2)







}