//南ことりと星空凛のKotlin入門 Part15
fun main(args: Array<String>) {
    var honoka: Singable = SchoolIdol3("Honoka Kosaka",16)
    var uzuki: Singable = ProffesionalIdol("Uzuki Shimamura","346Pro")
    var yui: Singable = Vocalist("Yui Hirasawa")
    
    var entry: Array<Singable> = arrayOf(honoka,uzuki,yui)
    for(e in entry){
        e.sing()
    }
    
}

interface Singable{
    fun sing()
}

class SchoolIdol3(name:String,age: Int): Singable{
    var name: String = name
    var age: Int = age
    
    override fun sing(){
        println("SchoolIdol Singing!")
    }
    
    fun dance(){
        println("SchoolIdol Dancing")
    }
}

class ProffesionalIdol(name:String,prod: String): Singable{
    var name: String = name
    var prod: String = prod
    
    override fun sing(){
        println("ProffesionalIdol Singing!")
    }
    
    fun dance(){
        println("ProffesionalIdol Dancing")
    }
    
    fun talk() {
        println("ProfessionalIdol Talking!!")
    }
}
class Vocalist(name: String) : Singable {
    var name = name

    override fun sing() {
        println("Vocalist Singing!!")
    }
}
//インターフェースを実装したものはインターフェースで宣言した名前の型としても使える
//そのため同じインターフェースを実装したもので配列を作れる
//abstractと違う点はgetter,setterを自分で定義しなければならない