//南ことりと星空凛のKotlin入門 Part31
fun main(args: Array<String>) {
	var n = 0
    try{
        n = 25252 / 0
    } catch(e: ArithmeticException){
        println(e)
    }finally{
        n=0
    }
    //例外処理にはtry、catch、finallyを使う
	//tryは、例外が発生するかもしれないコードを囲う
	//実際に例外が発生したらcatchの中が実行される
	//finallyは例外が発生してもしなくても必ず実行される
    
    var n1 = 0
    try {
        throw OriginalException("This is MyException")
    } catch (e: OriginalException) {
        println(e)
    } finally {
        n1 = 0
    }
    //Throwableを継承したクラスは例外として投げらる。
    //投げるときはthrowを使う

	var n2 = try{
        25252/0
    }catch(e: ArithmeticException){
        null
    }finally{
        0
    }
}

class OriginalException(msg: String) : Throwable(msg)
