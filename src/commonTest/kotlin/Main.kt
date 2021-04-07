import vector.dot
import vector.vec
import vector.x
import vector.yxw
import vector.zwx

fun main() {
    val vector = vec(1.0, 2.0, 3.0)
    val vector2 = vec(2.0, 3.0, 4.0)

    vector dot vector2

    vector[0..0].x

    // transpose
    vector.yxw + vector.zwx
}