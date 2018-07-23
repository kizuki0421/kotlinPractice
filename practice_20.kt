//南ことりと星空凛のKotlin入門 Part21-2
fun main(args: Array<String>){
    var honoka = object{
        fun hello(){
            println("I'm Honoka Kosaka School Idol!!")
        }
    }
    //何も継承しないオブジェクトも作れる
    honoka.hello()
    
    LoveLiveEntryManager.newEntry("μ's")
    LoveLiveEntryManager.newEntry("A-RISE")
    LoveLiveEntryManager.newEntry("Aqours")
    
    var umimi = SchoolIdol8.create()
}

object LoveLiveEntryManager{
    fun newEntry(team: String){
        teams.add(team)
    }
    var teams: java.util.ArrayList<String> = java.util.ArrayList<String>()
}
//オブジェクト宣言は式ではなく宣言でオブジェクトを定義する


class SchoolIdol8(){
    companion object Factory{
        fun create(): SchoolIdol8 = SchoolIdol8()
    }
}
//オブジェクト宣言はクラスの中にも書けその場合はコンパニオンオブジェクトという
//companionをつけて宣言します
//コンパニオンオブジェクトの名前はいらないので実際はFactoryと名前をつける必要もない
//コンパニオンオブジェクト自身がほしい場合はSchoolIdol.Companionと書くとアクセスできる