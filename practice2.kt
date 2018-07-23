//南ことりと星空凛のKotlin入門 Part7(for)
fun main(args:Array<String>){
    
    var arr:Array<Int> = arrayOf(25,25,2)
    var ite = arr.iterator()
        println(ite.next())
        println(ite.hasNext())
    
    for(e in arr){
        println(e)
    }
    
    for(i in arr.indices){
        println(i)
        println(arr[i])
    }
    
    for((i,v) in arr.withIndex()){
        println(i)
        println(v)
    }
    //forは基本配列の要素で回転する
    
    
}