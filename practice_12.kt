//南ことりと星空凛のKotlin入門 Part14
fun main(args: Array<String>) {
	var umi = SchoolIdol("Umi Sonoda", 16)
    
    println(umi.name)
    umi.name = "Umi Kosaka"
    println(umi.name)
    
    var nozomi = SchoolIdol2("Nozomi Tojo",17)
    println(nozomi.name)
    nozomi.group = "μ's"
    println(nozomi.group)
}

class SchoolIdol(name: String, age: Int){
    var name: String = name
    get() = field.toUpperCase()
    set(value){
        field = "Umi Sonoda"
    }
    var age: Int = age
}
//fieldはプロパティ値そのものでgetterとsetterの中のみでアクセス可能
//valで宣言した場合getterのみ使用可能

class SchoolIdol2(name: String,age: Int){
    var name: String = name
    var age: Int = age
    lateinit var group: String
}
//lateinitがついたプロパティはインスタンスを作ることができて、後から値を設定できます