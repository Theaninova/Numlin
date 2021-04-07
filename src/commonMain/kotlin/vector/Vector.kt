@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

fun vec(vararg elements: Double) = DoubleVector(elements)
fun vec(vararg elements: Float) = FloatVector(elements)
fun vec(vararg elements: Int) = IntVector(elements)
fun vec(vararg elements: Long) = LongVector(elements)
fun vec(vararg elements: Short) = ShortVector(elements)
fun vec(vararg elements: Byte) = ByteVector(elements)
