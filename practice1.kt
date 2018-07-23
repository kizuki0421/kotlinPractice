//南ことりと星空凛のKotlin入門 Part1~Part6
fun main(args: Array<String>) {
	if(args.size == 0) return
    println("First argument: ${args[0]}")
    //${変数名}とする事で + を省略できる
    
    
    for(arg in args){
        println(arg)
    }
    //argsの中身がある間ループを回す
    
    
    var rin:Int = 75
    var kot:Int = 80
    
    var win:Int =  if(rin>kot){
        println("にゃ！")
        rin
    }
    else{
        println("ちゅん！")
        kot
    }
    println(win)
    //ifの中で変数に代入せずとも最後に処理された文がreturn値となるため
    //変数名=if文とすることができる
    
    var s:String = "88"
    var x:Int = 90
    when(x){
        in 71..74 -> println("Niko")
        Integer.parseInt(s)-> println("Eri")
        !in 0..88 -> println("Nozomi")
        else -> println("Unknown")
    }
}

