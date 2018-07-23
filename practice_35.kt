import com.example.html.*
 
fun main(args: Array<String>) {
    println(result(args))
}
 
fun result(args: Array<String>) =
  html {
    head {
      title {+"XML encoding with Kotlin"}
    }
    body {
      h1 {+"XML encoding with Kotlin"}
      p  {+"this format can be used as an alternative markup to XML"}
 
      // 属性とテキストを持つ要素
      a(href = "http://kotlinlang.org") {+"Kotlin"}
 
      // 混在
      p {
        +"This is some"
        b {+"mixed"}
        +"text. For more see the"
        a(href = "http://kotlinlang.org") {+"Kotlin"}
        +"project"
      }
      p {+"some text"}
 
      // 生成されるコンテンツ
      p {
        for (arg in args)
          +arg
      }
    }
  }