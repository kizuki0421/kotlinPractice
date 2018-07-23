//南ことりと星空凛のKotlin入門 Part13-3
fun main(args : Array<String>){
    var honoka = SchoolIdol3("Honoka Kosoka")
    var uzuki = ProfessionalIdol3("Uzuki Shimamura")
    
    honoka.hello()
    honoka.sayName()
    uzuki.hello()
    uzuki.sayName()
}

abstract class Idol3(name: String){
    var name = name
    abstract fun hello()
    fun sayName(){
        println("My name is ${this.name}")
    }
}
//abstractクラスからはインスタンス生成できない
//abstract関数はサブクラスで必ずオーバーライドしないといいけない
class SchoolIdol3(name: String) : Idol3(name){
    override fun hello(){
        println("I am SchoolIdol!")
    }
}

class ProfessionalIdol3(name: String): Idol3(name){
    override fun hello(){
        println("I am Professional!")
    }
}