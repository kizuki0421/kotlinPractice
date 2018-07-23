//南ことりと星空凛のKotlin入門 Part21-1
fun main(args: Array<String>){
    var honoka = object : Idol5(), Singable2 {
        override fun hello() {
            println("I'm Honoka Kosaka, School Idol!!")
        }
    }
    honoka.hello()
        //objectってキーワードを使うことでクラスを定義することなくインスタンスを作れる
        //abstractクラスと同時にインターフェイスも
        //実装したい場合はカンマで区切って書けばよい
    
    var kotori = object{
        fun hello(){
            println("I'm Kotori Minami,")
        }
    }
}

abstract class Idol5{
    abstract fun hello()
}

interface Singable2