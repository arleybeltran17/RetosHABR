package com.example.myapplicationhabr.Retos

class Reto2 {
}

fun main() {

    var num1 = 1
    var total: Float = 0.0F
    var descuento: Float = 0.0f
    while (num1 == 1) {
        println("Digite El Nombre Del Producto")
        var nombre: String = readln()!!.toString()
        println("Digte El Precio Del Producto")
        var precio: Float = readln()!!.toFloat()

        println("Desea Digitar Otro Producto 1 = si, 0 = no ")
        num1 = readln()!!.toInt()
        total = precio + total
        println("el total es: " + total)
    }


    if (total >= 50000) {
        var bolita: Int = (1..4).random()
        println(bolita)
        if (bolita == 1) {
            println("felicidades has sacado la bolita roja")
            descuento = total / 10.0f
            println( "El Descuento Es De: "+descuento)
            total = (total - descuento)

            println("el total de su compra actual es: "+total)

        } else if (bolita == 2) {
            println("felicidades has sacasado la bolita azul")
            descuento = total / 30.0f
            println("El Descuento Es De: "+descuento)
            total = (total - descuento)

            println("El Total De Su Compra Actual Es: "+total)

        } else if (bolita == 3) {
            println(" que buena suerte has sacado la mejor bolita, la bolita amarilla")

            descuento = total / 50.0f
            println(descuento)
            total = (total - descuento)

            println("el total de su compra actual es: " + total)

        } else if (bolita == 4) {
            println("has sacado bolita blanca")
            println("que mala suerte sacaste la que no tiene descuento")
            println("el total de su compra actual es: " + total)

        }else{
            println("Error Vuelva A Intentar")
        }


        println("Con Cuanto Vas A Pagar?")
        var pago: Float = readln()!!.toFloat()

        if(pago>total){
            var resultado = total - pago
            println("Tus Vueltas Son: "+resultado)
        }else{
            println("No Te Alcanza Por Favor Vuelva A Intentar")
        }



    }
}