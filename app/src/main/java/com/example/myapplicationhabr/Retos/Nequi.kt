package com.example.myapplicationhabr.Retos

class Nequi {
}

fun main(){
    var Telefono = mutableListOf(3222671916, 3125123728, 3045495927)
    var Contra = mutableListOf(3456, 7654, 9580)

    var opcion: String = "si"
    var intento = 3

    var saldo: Long = 4500

    //------------- Funciones ---------------------
    fun saca() {

        println("Has Seleccionado Sacar Plata A Continuacion Se Mostrara Tu Saldo: $saldo")

        println("Por Favor Elegir Donde Retirar \n 1.Cajero Automatico \n 2.Punto Fisico")
        var puntoretiro:Int= readln()!!.toInt()

        if (puntoretiro==1){
            var codigo: Int = (100000..999999).random()
            println("Se Te Dara Un Codigo, Por Favor Insertar El Codigo Para Poder Retirar")
            println("Tu Codigo Es: $codigo")

            println("Ingresa Tu Codigo")
            var codigo2: Int = readln()!!.toInt()

            if (codigo2 == codigo) {
                if (saldo>=2000) {

                    println("Ingresa La Cantidad Que Deseas Retirar")
                    var saca: Int = readln()!!.toInt()

                    if (saca <= saldo) {


                        saldo -= saca
                        println("Retiro Exitoso Por Favor Reclama Tu Dinero")
                        println("Tu Saldo Restante Es De: $saldo")
                    } else {
                        println("Saldo No Disponible")
                    }
                    //cerrar otra condicion
                }else{
                    println("Tu Saldo Es Menor A 2000 Por Favor Recarga Dinero Para Poder Retirar")
                }
            } else {
                println("Codigo No Valido, Vuelva A Intentar")
            }
        }else if(puntoretiro==2){
            println("Has Seleccionado Punto Fisico")
            var codigo: Int = (100000..999999).random()
            println("Se Te Dara Un Codigo, Por Favor Insertar El Codigo Para Poder Retirar")
            println("Tu Codigo Es: $codigo")

            println("Ingresa Tu Codigo")
            var codigo2: Int = readln()!!.toInt()

            if (codigo2 == codigo) {
                if (saldo >= 2000)


                    println("Ingresa La Cantidad Que Deseas Retirar")
                var saca: Int = readln()!!.toInt()

                if (saca <= saldo) {

                    saldo -= saca
                    println("Retiro Exitoso Por Favor Reclama Tu Dinero")
                    println("Tu Saldo Restante Es De: $saldo")
                } else {
                    println("Saldo No Disponible")
                }
                //cerrar otra condicion
            }else{
                println("Tu Saldo Es Menor A 2000 Por Favor Recarga Dinero Para Poder Retirar")
            }

            } else {
                println("Codigo No Valido, Vuelva A Intentar")
            }
        }

    fun enviar(){
        println("Has Seleccionado Enviar")

        println("Por Favor Ingresar El Numero De Telefono De La Persona A La Cual Deseas Enviar Dinero")
        var tel3:Long= readln()!!.toLong()

        println("Por Favor Ingresar El Monto De Dinero A Enviar Ten En Cuenta Que Tu Saldo Es De: $saldo")
        var monto:Int= readln()!!.toInt()

        if (monto<saldo){

            saldo-=monto
            println("Envio Exitoso Tu Saldo Actual Es De: $saldo")
        }else{
            println("No Fue Posible El Envio, No Tienes Suficiente Saldo")
        }
    }

    fun recarga(){
        println("Has Ingresado A Recargar")
        println("Por Favor Ingresa El Monto A Recargar")
        var recarga:Long= readln()!!.toLong()

        println("Estas Seguro De Recargar $recarga")
        var desi:String= readln()!!.toString()

        if (desi=="si"){
            saldo=saldo+recarga
            println("Recarga Exitosa Tu Saldo Es De: $saldo")

        }else{
            println("Error Al Realizar La Recarga Por Favor Volver A Intentar")

        }

    }


    while (intento>0){

        println("Ingrese Su Numero De Telefono")
        var tel2: Long = readln()!!.toLong()

        println("Ingrese Su Contraseña")
        var contra2: Int = readln()!!.toInt()


        if (tel2 != null && tel2 in Telefono && contra2 != null && contra2 in Contra) {

            while (opcion == "si"){
                println("Bienvenido A Nuestros Servicios Nequi")


                println("Tu Saldo Es De: $saldo")

                println(" Que Accion Desea Realizar \n1.Saca \n 2.Envia \n 3.Recarga \n 4.Salir ")
                var opcion1: Int = readln()!!.toInt()

                if (opcion1 == 1) {
                    saca()

                } else if (opcion1 == 2) {
                   enviar()

                } else if (opcion1 == 3) {
                    recarga()

                } else if (opcion1 == 4) {
                    println("A Continuacion Se Mostrara Un Mensaje Preguntando Si Deseas Realizar Otra Opcion, Por Favor Digitar No :3")
                }else{
                    println("Opcion No Existente Por Favor Vuelva A Intentar")
                }

                println("Desea Realizar Otra Opcion? si o no?")
                opcion = readln().toLowerCase()
            }

        }else{
            intento = intento - 1;
            println(
                "¡Upps! Parece que tus datos de acceso\n" +
                        "no son correctos Le Quedan: $intento")
        }

        if (opcion=="no"){
            break
        }


        }
}


