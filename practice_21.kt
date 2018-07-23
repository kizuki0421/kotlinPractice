
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
	var emi = VoiceActor("ファイトだよっ！")
    var honoka = Character(emi)
    honoka.act()
}

interface Actor{
    fun act()
}

class VoiceActor(script: String): Actor{
    var script = script
    override fun act(){
        println(script)
    }
}

class Character(actor: Actor): Actor by actor
//Characterの定義のby actorによって実行されている
