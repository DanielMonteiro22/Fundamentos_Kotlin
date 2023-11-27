package fundamentos
fun main(){
//    print1a10()
//    print10a1()
//    print2a10()
    whileMenorQue10()
    doWhileMenoQue10()

}

fun whileMenorQue10(){
    var x = 0
    while(x < 10 ){
        println(x)
        x++
    }
}

fun doWhileMenoQue10(){
        var x = 10
    do{
        println(x)
        x++
    }while(x < 10)
}
fun print1a10(){
    for (numero in 1 .. 10 ){
        println(numero)
    }
}
fun print10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}
fun print2a10(){
    for(numero in 2 ..10 step 2){
        println(numero)
    }
}