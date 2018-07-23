//南ことりと星空凛のKotlin入門 Part10-2,Part11
fun main(args : Array<String>){
    hello(fun(a:String,b:String): String = a+b)
    //ラムダ式と違うところは返り値の型を明示できる
    //書き方は単一行関数と同じ
    
    var sum:Int = 0
    arrayOf(1,2,3,4,5).filter{it <= 5}.forEach{sum=sum+it}
    println(sum)
    //ラムダ式の中からはラムダ式外の変数にアクセス可能
    //クロージャーという
    
    var CP = fun String.(other: String) : String = this + other
    println("こと".CP("うみ"))
    
    var pl = fun Int.(ot: Int) : Int = this + ot
    println(1.pl(3))
    //レシーバ付き関数リテラル
    //特定の型に対して別のものを付けることができる
    
    val SchoolName: (String) -> Unit = {school -> println(school)}
    val StuName: (String) -> Unit = {student -> println(student)}
    hello2(SchoolName,StuName)
}

fun hello(pair:(String,String) -> String){
    println(pair("のぞ","えり"))
    println(pair("こと","りん"))
}

inline fun hello2(SchoolName: (String)-> Unit,noinline StuName:(String)->Unit){
    SchoolName("音ノ木坂学院")
    StuName("南ことり")
    
}
 //インライン関数は関数として呼び出されるのではなく関数の中身がコードとして展開される
 //なので今回はデコンパイルするとSchoolNameがmainの中でSystem.out.print(school)
 //という形で展開される
 //noinnlineをつければ引数ごとにinlineかどうかを制御できる