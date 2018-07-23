//南ことりと星空凛のKotlin入門 Part19-1
fun main(args: Array<String>){
    var printemps = Trio<SchoolIdol7>(SchoolIdol7("Honoka"),SchoolIdol7("Kotori"),SchoolIdol7("Umi"))
    var newGenerations = Trio<ProIdol>(ProIdol("Uzuki"),ProIdol("Rin"),ProIdol("mio"))
    //TをProlIdolにすればプライマリコンストラクタの引数は全部ProlIdolになる
}

class Trio<T>(center: T, left: T, right: T){
    var center = center
    var left = left
    var right = right
}
//Trioというクラスがジェネリッククラスで、Tという型パラメータを取ります

 class SchoolIdol7(name: String)
class ProIdol(name: String)


interface Source<out T>{
    fun next(): T
}
//outってキーワードを使用することでTは出力にしか使われないことをコンパイラに教えてあげる
//逆にinを使うことでTは入力にしか使われないことをコンパイラに教えてあげる

fun demo(s: Source<String>){
    val objects: Source<Any> = s
}
