//南ことりと星空凛のKotlin入門 Part13-2
fun main(args : Array<String>){
	var uzuki = Idol2()
    var honoka = SchoolIdol2()
    
    uzuki.hello()
    honoka.hello()
}

open class Idol2(){
    open fun hello(){
        println("I am Idol!")
    }
}

class SchoolIdol2() : Idol2(){
    override fun hello(){
        println("I am SchoolIdol!")
    }
}
//スーパークラスにある関数にopenをつけてサブクラスにある関数にoverrideをつける