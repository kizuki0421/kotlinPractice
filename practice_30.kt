//南ことりと星空凛のKotlin入門 Part30
fun main(args: Array<String>){
    var str1: String = "Kotori"
    var str2: String? = "rin"
    //?がついた型はNULL許容型みたいな呼び方をする
    //通常の型と違って値としてnullを持つことができる
    //普通の型はnullにはならない
    
    var l1 = str1.length
    var l2 = -1
    
    if(str2 != null){
        l2 = str2.length
    }
    //事前にチェックされていれば、変数が変更されない範囲において
    //プロパティへのアクセスができる
}
//str2?.lengthという書き方をすると未チェックでもプロパティを参照できる

//var l2 = str2.length ?: -1
//とすると、strがnullでなければ文字列の長さがnullなら-1が得られる

//Kotlinの思想はNULL参照を排除することなので、NullPointerExceptionは本来発生すべきでない
