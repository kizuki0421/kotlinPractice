//南ことりと星空凛のKotlin入門 Part17
fun Idol3.hello() = println("I'm Idol")
fun SchoolIdol5.hello() = println("I'm SchoolIdol")
//拡張関数と継承の違いはインスタンスが何かではなく変数の型で呼び出される関数が決まること

val Idol3.firstName: String
	get() = name.split(" ")[0]
//これはfirstNameというプロパティを追加している
//拡張プロパティはバッキングフィールドを持たないためgetterとsetterは定義してあげる必要がある

fun main(args: Array<String>) {
    var uzuki: Idol3 = Idol3("Uzuki Shimamura")
    var honoka: SchoolIdol5 = SchoolIdol5("Honoka Kosaka")
    var umi: Idol3 = SchoolIdol5("Umi Sonoda")
    
    uzuki.hello()
    honoka.hello()
    umi.hello()
    
    println(uzuki.firstName)
}

open class Idol3(name: String){
    var name = name
}

class SchoolIdol5(name: String): Idol3(name){
}