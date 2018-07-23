//南ことりと星空凛のKotlin入門 Part33
fun main(args: Array<String>){
    val cls = SchoolIdol::class
    println(cls.simpleName)
    
    
    fun kotori() = println("ちゅんちゅん")
    fun rin() = println("にゃ")
    
    hello(::kotori)
    hello(::rin)
    
    
    val age = SchoolIdol33::age
    //SchoolIdol::ageみたいにクラス名の後にプロパティ名を指定すると、
    // KProperty のインスタンスが取れる
    // SchoolIdolのインスタンスを渡すと、ageプロパティの値を返してくれる
    // このKPropertyは特定のSchoolIdolのインスタンスと結びついてるわけではない
    
    println(age.name)
    println(age.get(SchoolIdol33("Honoka Kosaka",16)))
}

class SchoolIdol constructor(name: String){}
//SchoolIdol::classと書くとKClassのインスタンスが取得できるため情報を引き出せる
//simpleNameがクラスの名前のプロパティ
//他にも、コンストラクタ、クラスのメンバのコレクションにもアクセスできる

fun hello(words: () -> Unit){
    words()
}
//::kotoriなどで KFunction のインスタンスが取れる

class SchoolIdol33(name: String,age: Int){
    val name: String = name
    var age: Int = age
}