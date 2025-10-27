import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.typeOf

fun main() {
    println(typeOf<Foo<in String>>().isSubtypeOf(typeOf<Baz>()))
}

interface Baz