//南ことりと星空凛のKotlin入門 Part23-import

import otonokizaka.*
//importでパッケージ名を指定すると、そのパッケージのクラスや関数を使えるようになる
//最後に*をつけてパッケージ内の全部をインポートしている
//import otonokizaka.SchoolIdolと書くとSchoolIdolクラスだけインポートできる

//違うパッケージに同じ名前があり衝突する場合asを使う

fun main(args: Array<String>){
    var nico = SchoolIdol()
    nico.hello()
    
    pair("こと","うみ")
}