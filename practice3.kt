//南ことりと星空凛のKotlin入門 Part7(while)

fun main(args:Array<String>){
    var i : Int = 0
    var j : Int = 0
    while(i<2){
        println("Super LOVE=Super LIVE!!")
        i++
    }
    //whileは基本数値で回転
    
    loop@ for(i in 0..2){
        println("Start Outer Loop")
        for(j in 0..2){
            println("Start Inner Loop")
            if(j == 1) break@loop
            println("End Inner Loop")
        }
        println("End Outer Loop")
    }
    println("After Loop")
    //loop@でラベル付けしてbreak@loopでラベル付けした
    //for全体を抜ける
   
}
