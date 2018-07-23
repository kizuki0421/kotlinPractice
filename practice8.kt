//南ことりと星空凛のKotlin入門 Part13-1
fun main(args : Array<String>){
    var honoka = SchoolIdol("honoka","Otonokizaka High",Idol.Profile("いちご",78,58,82))
    honoka.sing()
    honoka.dance()
    honoka.study()
    println(honoka.profile.favorite)
    println(honoka.school)
}

open class Idol(name: String,profile: Profile){
    var name: String = name
    var profile: Profile = profile
    
    fun sing(){
         println("${this.name} singing!")
    }
    fun dance() {
    	println("${this.name} dancing!")
    }
    
    class Profile(favorite: String, b: Int, w: Int, h: Int){
        var favorite: String = favorite
        var threeSize: Array<Int> = arrayOf(b,w,h)
    }
}

class SchoolIdol(name: String, school: String, profile: Profile) : Idol(name,profile){
    var school: String = school
    fun study(){
        println("${this.name} studying...")
    }
}
//クラスの継承は継承元のクラスにopenを付ける