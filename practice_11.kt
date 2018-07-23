//南ことりと星空凛のKotlin入門 Part13-3
fun main(args : Array<String>){
    var x: Idol6 = Idol6.SchoolIdol()
    when(x) {
        is Idol6.SchoolIdol -> println("SchoolIdol")
        is Idol6.ProfessionalIdol6 -> println("ProfessionalIdol")
        else -> println("not idol")
    }
}

sealed class Idol6{
    class SchoolIdol() : Idol6()
    class ProfessionalIdol6() : Idol6()
}
//(・8・)＜ちょっとよくわからない