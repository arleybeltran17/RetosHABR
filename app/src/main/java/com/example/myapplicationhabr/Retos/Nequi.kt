package com.example.myapplicationhabr.Retos

class Nequi {
}

fun main() {
    val Telefono:Long=3222672926
    var Contra:Long=2547

    println("Ingrese Su Numero De Telefono")
    var tel2:Long= readln()!!.toLong()

    println("Ingrese Su Contraseña")
    var contra2:Long= readln()!!.toLong()

    if(tel2==Telefono ){
        if (contra2==Contra){

            println("Bienvenido A Nuestros Servicios Nequi")

            var saldo:Int=4500
            println("Tu Saldo Es De: $saldo")

            println(" Que Accion Desea Realizar \n1.Saca \n 2.Envia \n 3.Recarga \n 4.Salir ")
            var opcion:Int= readln()!!.toInt()

            if (opcion==1){

                println("Has Seleccionado Sacar Plata A Continuacion Se Mostrara Tu Saldo: $saldo")
                println("Ingresa La Cantidad Que Deseas Retirar")
                var saca:Int= readln()!!.toInt()

                if (saca<=saldo){

                    var newsaldo=saldo-saca
                    println("Retiro Exitoso Por Favor Reclama Tu Dinero")
                    println("Tu Saldo Restante Es De: $newsaldo")

                }else{
                    println("Saldo No Disponible")
                }

            }else if(opcion==2){

            }else if(opcion==3){

            }else if(opcion==4){

            }



        }else{
            println("¡Upps! Parece que tus datos de acceso\n" +
                    "no son correctos, Tienes tres intentos más")
        }

    }else{

        println("¡Upps! Parece que tus datos de acceso\n" +
                "no son correctos, Tienes tres intentos más")

    }
}