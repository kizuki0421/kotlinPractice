//南ことりと星空凛のKotlin入門 Part26,Part27
fun main(args: Array<String>){
    for(i in 1..5){
        println(i)
    }
    println("")
    for (i in 10 downTo 1 step 2){
        println(i)
    }
    //範囲は「num..num」で指定できる
    //downToは逆順とすることができる
    //stepは指定した間隔で数字順番となる
    //step,downToは一つ一つでも合わせても使える
    
    
    
    var x: Any = "nico"
    x = 25252
    if(x is String){
        println("x is String")
    }
    else if(x is Int){
        println("x is Int")
    }
    else {
        println("x is another")
    }
    
    var y: Any = "nozomi"
    if(y is String){
        println(y.length)
    }
    //valで宣言したローカル変数...常にスマートキャスト適用
	//valで宣言したプロパティ...プロパティがprivateかinternalの場合と
	//						 同じモジュール内でチェックされる場合に適用
	//						 openなプロパティや独自のgetter関数を持つプロパティには適用されない
	//varで宣言したローカル変数...チェックと使用の間で変更されず、ラムダ式からもアクセスされない場合に適用
	//varで宣言したプロパティ...適用されない（常に変更される可能性があるため）

    
    var z: Idol = SchoolIdol27()
    var honoka: String? = z as? String
    var eri: SchoolIdol27 = z as SchoolIdol27
}
open class Idol

class SchoolIdol27: Idol()