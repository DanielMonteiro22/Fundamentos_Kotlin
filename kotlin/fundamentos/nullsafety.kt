package fundamentos

fun main(){

    var nome : String? = null
    if (nome != null ){
        println(nome.length)
    }
     println(nome?.length)
}