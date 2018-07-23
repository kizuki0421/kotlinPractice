//南ことりと星空凛のKotlin入門 Part28
fun main(args: Array<String>){
    var honoka1 = SchoolIdol("Honoka Kosaka",16)
    var honoka2 = honoka1
    var honoka3 = honoka1.copy()
    
    println(honoka1 == honoka2)//ture
    println(honoka1 === honoka2)//true
    
    println(honoka1 == honoka3)//true
    println(honoka1 === honoka3)//false
    //==は値の比較。同値ならtrue
    //===は同じオブジェクトを指しているか。同値でも同じオブジェクトを指してなければfalse
    //honoka2はhonoka1を複製しているため===の時はtrue
    //honoka3はcopy()でオブジェクトを複製して新しいオブジェクトを生成しているため
    //===の時はfalse
}

data class SchoolIdol(var name:String,var age: Int)