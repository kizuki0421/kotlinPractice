//南ことりと星空凛のKotlin入門 Part12
fun main(args : Array<String>){
    var honoka = SchoolIdle("honoka",SchoolIdle.Profile("いちご",78,58,82))
    honoka.sing()
    honoka.dance()
    println(honoka.profile.favorite)
    
     var umi = SchoolIdle("umi", "Otonokizaka High.", SchoolIdle.Profile("ほむまん", 76, 58, 80))
}

class SchoolIdle(name: String,profile: Profile){
    var name: String
    var school: String
    var profile: Profile
    
    init{
        this.name = name
        this.school = ""
        this.profile = profile
    }
    //クラスと引数の数が一致しているコンストラクタ(initで宣言)をプライマリコンストラクタという
    
    constructor (name: String, school: String, profile: Profile):this(name,profile){
        this.school = school
    }
    //プライマリコンストラクタさらに追加で初期化をするコンストラクタ（constructorで宣言）をセカンダリコンストラクタという
    
    fun sing(){
        println("${this.name} singing")
    }
    fun dance(){
        println("${this.name} dancing")
    }
    
    class Profile(favorite: String, b: Int, w: Int, h: Int){
        var favorite: String = favorite
        var threeSize: Array<Int> = arrayOf(b,w,h)
    }
    //クラス内のクラスにはネステッドクラスとインナークラスがある
    //ネステッドクラスは外側の変数を参照できない(classで宣言)
    //インナークラスは外側の変数を参照できる(inner classで宣言)
}
//クラス内にある関数や変数はクラスのインスタンスに対して呼び出すことができる
