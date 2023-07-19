package com.example.myapplicationhabr.Retos

class Reto3 {
}

fun main() {
    var opcion="si"

    val coches= mutableListOf("renault","ford","ferrari")

    while (opcion=="si"){

        println("Bienvenid@s A Los Autos De Lamborghini")
        println("De Las Siguientes Opciones: \n 1. Insertar Un Nuevo Coche \n 2. Mostrar Todos Los Coches Disponibles \n 3. Buscar Un Coche En Particular \n 4. Modificar Un Coche Disponible \n 5. Eliminar Un Coche Existente")
        var opcion2:Int= readln()!!.toInt()


        if(opcion2==1){

            println("Has Elegido Insertar Un Nuevo Coche Por Favor Digita El Coche A Insertar")
            var insertcoche:String= readln()!!.toString().lowercase()

            if(coches.any { it == insertcoche }){
                println("El Coche Que Deseas Insertar Ya Existe")
            }else{
                coches.add(insertcoche)
                println("Se Ha Insertado Con Exito, El Coche Insertado Es: $insertcoche")
            }

        }else if (opcion2==2){

            println("Has Seleccionado Mostrar Todos Los Coches Disponibles, A Continuacion Se Mostraran Todos Los Coches")
            for (e in coches){
                println(" $e ")
            }

        }else if (opcion2==3){

            println("Has Elegido Buscar Un Coche, Por Favor Ingresa El Nombre Del Coche")
            var nombreBuscado:String = readln()!!.toString().lowercase()


            // Usando find()
            val cocheEncontrado = coches.indexOf(nombreBuscado )

            if (cocheEncontrado != -1){

                println("El Auto Encontrado Es: $nombreBuscado Y Se Encuentra En La Posicion $cocheEncontrado" )

            }else{
                println("Auto Digitado No Se Encuentra, Por Favor Vuelva A Intentar")
            }




        }else if (opcion2==4){
            println("Has Elegido Modificar Un Coche Disponible A Continuacion Se Mostrara Una Lista De Coches Con Su Respectica Posicion")
            for ((i,e) in coches.withIndex()) {
                println("Posicion: $i Nombre: $e ")
            }

                println("Digite La Posicion Del Coche")
                var posicion:Int= readln()!!.toInt()

                println("Digite El Nuevo Nombre Del Coche")
                var nuevoNombre:String= readln()!!.toString()

            var posicion1= coches.indexOf("$posicion")

            if (posicion1 != -1 ){
                coches[posicion]=nuevoNombre
                println("Modificacion Exitosa, Ve A Ver La Lista De Los Coches")
            }else{
                println("Por Favor Ingresar Una Posicion Valida")
            }


        }else if (opcion2==5){
            println("Has Elegido Eliminar Un Coche, Por Favor Digite El Nombre Del Coche A Elimiar")
            var eliminar:String= readln()!!.toString()

            val cocheEncontrado = coches.indexOf(eliminar)

            if (cocheEncontrado != -1){
                coches.removeAll(listOf(eliminar))
                println("Eliminacion Exitosa, El Coche Eliminado Fue: $eliminar")
            }else{
                println("Coche No Encontrado, Por Favor Verifique El Nombre Del Coche")
            }



        }

    println("Desea Realizar Otra Accion? si o no?")
    opcion= readln().lowercase()

    }


}