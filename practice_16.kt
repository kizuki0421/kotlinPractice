//南ことりと星空凛のKotlin入門 Part18
fun main(args: Array<String>){
    var honoka = SchoolIdol6("Honoka Kosaka", 16)
    println(honoka.toString())
    println(honoka.hashCode())
    
    var umi = honoka.copy(name = "Umi Sonoda")
    println(honoka.toString())
    
    println(honoka.equals(umi))
}

data class SchoolIdol6(val name: String, var age: Int)
//データクラスはdata classと宣言してする
//データクラスでは、toString、hashCode、equals、copyの各関数が自動生成されます。

//データクラスは、いくつか条件を満たす必要があります
//1,プライマリコンストラクタは最低1つの引数を取ること
//2,プライマリコンストラクタの引数はすべてvarかvalが明示されていること
//3,abstract、open、sealed、innerではないこと
//4,他のクラスを継承していないこと、ただしインターフェイスの実装はOK