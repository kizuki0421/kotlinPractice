//南ことりと星空凛のKotlin入門 Part20
fun main(args: Array<String>){
	var pos: Position = Position.center
    
    when(pos){
        Position.center -> println("center")
        Position.left -> println("left")
        Position.right -> println("right")
    }
    
    var nozomi = grade3.Tojo
    nozomi.sing()
    
    
    grade3.valueOf("Tojo").sing()
    for(v in grade3.values()){
        v.sing()
    }
    //名前を指定してEnum定数を取得したり、列挙クラスの全ての定数を取得したりもできます
}

enum class Position{
    center,left,right
}
//enumってキーワードをつけて宣言したクラスは列挙クラスになりそこに書いた値しか持てなくなる

enum class grade3(val b: Int){
    Yazawa(71){
        override fun sing(){
            println("まほうつかいはじめました！")
        }
    },
    
    Ayase(88){
        override fun sing(){
            println("ありふれた悲しみの果て")
        }
    },
    
    Tojo(90){
        override fun sing(){
            println("純愛レンズ")
        }
    };
    abstract fun sing()
}
//Enum定数には明示的に値を持たせることができます
//Enum定数は内部の無名クラスとして、関数を定義したりできる
