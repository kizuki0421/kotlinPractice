//南ことりと星空凛のKotlin入門 Part10-1
fun main(args : Array<String>){
    fun kotori() = println("ちゅんちゅん")
    fun rin() = println("にゃ")
    
    hello(::kotori)
    hello(::rin)
    
    hello2({msg: String -> println(msg)})
    //{msg: String -> println(msg)}の部分がラムダ式
    
    var greet1 = {msg: String -> println(msg)}
    var greet2: (String) -> Unit = {msg -> println(msg)}
    //変数かラムダ式のどちらかに型が明示されていればもう片方は省略できる
    //greet1の場合ラムダ式に型が明示されている
    //greet2の場合は変数に型が明示されている
    
    hello2(greet1)
    hello2(greet2)
    
    hello2({println(it)})
    //引数を一つしか取らないラムダ式の場合引数を省略可能
    //その場合itという変数に引数が入る
}

fun hello(words: () -> Unit){
    words()
}
//高階関数（関数を引数にとる関数）は fun 関数名(関数名:(引き値の型、引き値の型....)->返り値の型)とできる
//上記の場合引き値なし、返り値Unitとなっている

fun hello2(greet: (String) -> Unit){
    greet("ちゅんちゅん")
	greet("にゃ")
}