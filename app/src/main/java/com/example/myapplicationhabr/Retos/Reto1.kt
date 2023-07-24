package com.example.myapplicationhabr.Retos

class Reto1 {
}

fun main() {

    println("Preparados Para Jugar?")
    println("Listos O No Alla Vamos")
    println("Se Lanzaron Los Dados")

    var dado1:Int=(1..6).random();
    var dado2:Int=(1..6).random();

    println("Dado 1: "+dado1)
    println("Dado 2: "+dado2)

    var result:Int= dado1+dado2;

    if (dado1==1 && dado2==1){
        println("Ganaste Con Un Par De Unos")
    }else if(result==3){
        println("Ganaste Con Un Total De 3")
    }else if(result==11){
        println("Ganaste Con Un Total De11")
    }else if(result==2 || result==12){
        println("Ganaste Con Un Total De 2 o 12")
    }else if(result==7){
        println("Ganaste Con Un Total De 7")
    }else {
        println("Pierdes Suerte A La Proxima pudiste haber perdido por que \n 1. sacaste 1 4 5 6 8 9 o 10 \n 2. No Sacaste Par De 6 o 1")
    }

}