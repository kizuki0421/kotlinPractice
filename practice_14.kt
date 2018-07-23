//南ことりと星空凛のKotlin入門 Part16
fun main(args: Array<String>) {
    var uzuki: Idol = Idol()
    uzuki.sing()
    //uzuki.practice()
    //uzuki.audition()
}

open class Idol{
    public fun sing(){
        println("Sing!!")
    }
    //publicはどこからでもアクセス可能
    //何も記述が時と同じ
    
    protected fun practice(){
        println("Practice!")
    }
    //protectedは宣言してあるクラスとサブクラスかアクセス可能
    
    private fun audition(){
        println("I waana be Idol!")
    }
    //privateは宣言してあるクラスからのみアクセス可能
    
    fun work(){
        sing()
        practice()
        audition()
    }
}

class SchoolIdol4: Idol(){
    fun activity(){
        sing()
        practice()
        //audition()
    }
}