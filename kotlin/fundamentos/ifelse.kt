package fundamentos

fun main(){
    //parOuImpar(2)
    //parOuImpar(3)

    //resultadoDaNota(3)
    //resultadoDaNota(5)
    //resultadoDaNota(8)

    println(parOuImpar(2))
    println(parOuImpar(9))
}
fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0){
        "Par"
    } else{
        "impar"
    }
}
fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("Passou")
    }else  if(nota >=4 ){
        println("recuperaçao")
    }else {
        println("reprovado")
    }
}