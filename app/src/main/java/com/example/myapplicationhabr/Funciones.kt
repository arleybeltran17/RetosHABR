package com.example.myapplicationhabr
fun areaCirculo() {
    println("Digite El Radio Del Circulo")
    var radio: Double = readln()!!.toDouble()

    var result = radio * 3.1416
    println("El Area Del Cirlculo Es: $result")
}

fun perimetroCirculo() {
    println("Digite El Diametro Del Circulo")
    var diametro: Double = readln()!!.toDouble()
    var result = diametro * 3.1416
    println("El Perimetro Del Circulo Es: $result")
}

fun areaTriangulo(base:Double, altura:Double){

    var result= (base!!*altura!!)/2

    println("El Resultado Del Area Del Triangulo Es: $result")

}

fun perimetroTriangulo(lado1:Double?,lado2:Double?,lado3:Double?){

    var result= lado1!! +lado2 !!+ lado3!!
    println("El Perimetro Del Triangulo Es: $result")

}

fun areaRectangulo(largo:Double, ancho:Double):Double{

    var result=largo!!*ancho!!

    return result
}

fun perimetroRectangulo(lado:Double,ancho: Double):Double{

    var lado1=lado!!+lado!!
    var ancho1=ancho!!+ancho!!

    var result=lado1*ancho1;

    return result

}

class Funciones {
}

fun main() {
    /*
    val temperaute = 50
    val isHot = if(temperaute>40) true else false

    println(isHot)

    println("Ingrese Su Edad")
    var edad:Int= readln()!!.toInt()
    var guard = if(edad>=18) "Bienvenido :3" else "Pa La Casa >:v"

    println(guard)
    */



    var opcion = "si"

    while (opcion == "si") {

        println("Bienvenido, Por Favor Ingrese La Opcion Que Desea Realizar \n 1.Calcular Area De Un Circulo \n 2.Calcular El Perimetro De Un Circulo \n 3.Area De Un Triangulo \n 4.Perimetro De Un Triangulo \n 5.Area De Rectangulo \n 6.Perimetro De Rectangulo" )
        var opcion2: Int = readln()!!.toInt()

        if (opcion2 == 1) {

            areaCirculo()

        } else if (opcion2 == 2) {

            perimetroCirculo()

        } else if(opcion2==3){

            println("Ingrese La Base Del Triangulo")
            var base:Double= readln()!!.toDouble()

            println("Ingrese La Altura Del Triangulo")
            var altura:Double= readln()!!.toDouble()

            areaTriangulo(base,altura)

        }else if (opcion2==4){

            println("Ingrese El Valor Del Primer Lado")
            var lado1:Double= readln()!!.toDouble()

            println("Ingrese El Valor Del Primer Lado")
            var lado2:Double= readln()!!.toDouble()

            println("Ingrese El Valor Del Primer Lado")
            var lado3:Double= readln()!!.toDouble()

            perimetroTriangulo(lado1,lado2,lado3)


        }else if (opcion2==5){

            println("Ingrese El Largo Del Rectangulo")
            var largo:Double= readln()!!.toDouble()
            println("Ingrese El Ancho Del Rectangulo ")
            var ancho:Double= readln()!!.toDouble()

            var rect=areaRectangulo(largo,ancho)
            println("El Area Del Rectangulo Es: $rect")

        }else if(opcion2==6){
            println("Ingrese El Valor Del Lado Del Rectangulo")
            var lado:Double= readln()!!.toDouble()
            println("Ingrese El Valor Del Ancho Del Rectangulo")
            var ancho:Double= readln()!!.toDouble()

            var rect=perimetroRectangulo(lado,ancho)

            println("El Perimetro Del Rectangulo Es: $rect")
        } else {
            println("Error Vuelva A Intentar")

        }

        println("Desea Realizar Otra Accion? si o no?")
        opcion = readln().lowercase()
    }


}