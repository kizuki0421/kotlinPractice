//南ことりと星空凛のKotlin入門 Part22-2
import kotlin.reflect.KProperty
 
fun main(args: Array<String>) {
    var emi = VoiceActor2("Emi Nitta")
    var honoka = Character2(emi)
    println(honoka.cast)
    honoka.cast = "Emi *****"
    println(honoka.cast)
}
 
class Character2(actor: VoiceActor2) {
    var cast: String by actor
}
 
class VoiceActor2(name: String) {
    var name = name
 
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return name
    }
 
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        name = value
    }
}
//プロパティの委譲もサポートされている