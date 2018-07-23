//南ことりと星空凛のKotlin入門 Part32
fun main(args: Array<String>){
    sing()
    sing2()
}

@Deprecated("この関数は非推奨です") fun sing(){
    println("僕らは今のなかで")
}
//@Deprecatedというアノテーション
//sing関数を非推奨としてマークしたがこれを実行し、Problems Viewを見ると
//Warning:(2, 4) ‘sing(): Unit’ is deprecated. この関数は非推奨です
//と出力される
fun sing2(){
    println("それは僕たちの奇跡")
}


@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER,AnnotationTarget.EXPRESSION)
	//@Targetはどこに付けられるか
@Retention(AnnotationRetention.SOURCE)
	//@Retentionはアノテーションの情報をコンパイルされたファイルに残すかどうか
@MustBeDocumented
	//@MustBeDocumentedは公開APIとしてドキュメント化すべきか
public annotation class Fancy
	//アノテーションはアノテーションクラスという形で自分でも作成できる
@Fancy class SchoolIdol32{
	@Fancy fun count(@Fancy guest: Int): Int{
		return (@Fancy 9 + guest)
	}
}
//クラスにつけたり関数につけたり、引数や関数内の式にもつけられる

//class SchoolIdol32_2 @Fancy constructor(name: String) {}