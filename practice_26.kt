//南ことりと星空凛のKotlin入門 Part25
import kotlin.collections.*

fun main(args: Array<String>){
    var l: List<Int> = listOf(71,88,90)
    //l[0] = 74
    var ml: MutableList<Int> = mutableListOf(71,88,90)
    ml[0] = 74
     //普通のListは変更できない
     //MutableListは変更できる
     
     
    var s: Set<Int> = setOf(71,88,90)	
    //s.add(75)
    var ms: MutableSet<Int> = mutableSetOf(71,88,90)
    ms.add(75)
    //Setは順序を持たない、重複を許さない値の集合
    //変更できないSetと変更できるMutableSetがある
    
    
    var m: Map<String,Int> = mapOf("nico" to 71,"eri" to 88,"nozomi" to 90)
    //m["nico"] = 74
    var mm: MutableMap<String,Int> = mutableMapOf("nico" to 71,"eri" to 88,"nozomi" to 90)
	mm["nico"] = 74
    //Mapはキーバリューペア、重複を許さないキーに対して何かの値を割り当てるデータ構造
    //変更できないMapと変更できるMutableMapがある
}