//南ことりと星空凛のKotlin入門 Part9
fun main(args : Array<String>){
    println(umi("こと"))
    println(umi("りん"))
    //umi関数呼び出し
    
    println(trio("ほの","こと","うみ"))
    println(trio("ほの","こと"))
    println(trio("にこ"))
    //trio関数呼び出し
    
    println(trio(b="こと"))
    //関数の引値の変数名を指定することで意図した場所に代入できる
    
    CP("nozomi")
    //Unitの関数を呼び出している
    
    println(repeat("ちゅん"))
    //単一式関数を呼び出している
    
    printmember("にこ","のぞ","えり")
}

fun umi(name:String) : String{
    if(name.equals("こと")) return name + "うみ"
    else return "うみ"
}

fun trio(a:String = "ほの",b:String = "りん",c:String = "ぱな"):String{
    return a+b+c;
}
//関数はデフォルト値があったとしても引き渡し値が
//ある場合引き渡し値が優先される

fun CP(member:String):Unit{
    when(member){
        "kotori" -> println("umi")
        "nozomi" -> println("eri")
        "rin" -> println("hanayo")
    }
}
//Unitにすることで返り値が必要なくなる
//voidと同じ

fun repeat(res:String) : String = res + res
//単一式関数はブロックを作る必要がない小さい関数を作る時に良い
//＝で直接returnできる

fun printmember(vararg member: String): Unit{
    for(m in member) print(m)
}
//変数名にvarargをつけることで可変長引数として扱える
//自動的にリストを生成できる