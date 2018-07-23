//南ことりと星空凛のKotlin入門 Part24
fun main(args: Array<String>){
    var honoka = SchoolIdol24("Honoka Kosaka",16)
    var (name,age) = honoka
    //var (name, age)のnameにはcomponent1の結果が、ageにはcomponent2の結果が入る
    
    println(name)
    println(age)
    
    
    var nozomi = SchoolIdol24_2("Nozomi Tojo",17)
    var (name2,age2) = getProperties(nozomi)
    println(name2)
    println(age2)
}

class SchoolIdol24(name: String, age: Int){
    var name = name
    var age = age
    
    operator fun component1(): String{
        return name
    }
    
    operator fun component2():Int{
        return age
    }
}


data class Result(val name: String,val age: Int)
//Resultというデータクラスを用意して、getProperties関数はそれを返すようにしている
//var (name, age)に代入することで名前と年齢の2つを同時に返したことになる
//データクラスはcomponentN関数を自動生成してくれる

fun getProperties(i: SchoolIdol24_2): Result{
    var name: String = i.name
    var age: Int = i.age
    return Result(name,age)
}

class SchoolIdol24_2(name: String,age:Int){
    var name = name
    var age = age
}

