//南ことりと星空凛のKotlin入門 Part29
fun main(args: Array<String>) {
    var muse = Unit("μ's")
    muse += SchoolIdol29("Kotori Minami")
    muse += SchoolIdol29("Umi Sonoda")
    muse.print()
    
    /*var aa: Int = 0
    aa += 1
    println(aa)*/
}
 
class SchoolIdol29(name: String) {
    var name: String = name
}
 
class Unit(name: String) {
    var name: String = name
    var members: MutableSet<SchoolIdol29> = mutableSetOf()
 
    operator fun plusAssign(member: SchoolIdol29) {
        members.add(member)
    }
 
    fun print() {
        for(m in members) {
            println(m.name)
        }
    }
}
//UnitクラスのplusAssign関数は、演算子+=に対応した関数名で、
//operatorというキーワードを付けると+=演算子の処理として認識される