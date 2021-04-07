@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

import kotlin.math.min
import kotlin.math.sqrt

// @formatter:off
inline class DoubleVector(val data: DoubleArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Double) : this(DoubleArray(shape) { init(it) })
    constructor(shape: Int) : this(DoubleArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[min(i, data.size + i)]
    operator fun set(i: Int, value: Double) = run { data[min(i, data.size + i)] = value }
    operator fun get(i: IntProgression) = DoubleVector((i.last - i.first + 1) / i.step) { get(it) }
    
    /// Unary operations
    operator fun unaryPlus()  = DoubleVector(data.size) { +data[it] }
    operator fun unaryMinus() = DoubleVector(data.size) { -data[it] }
    operator fun inc()        = DoubleVector(data.size) { data[it]++ }
    operator fun dec()        = DoubleVector(data.size) { data[it]-- }
    
    /// Broadcast Primitive Operations
    operator fun plus(b: Double) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Float) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Long) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Int) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Short) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Byte) = DoubleVector(shape) { data[it] + b }

    operator fun minus(b: Double) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Float) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Long) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Int) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Short) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Byte) = DoubleVector(shape) { data[it] - b }

    operator fun times(b: Double) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Float) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Long) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Int) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Short) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Byte) = DoubleVector(shape) { data[it] * b }

    operator fun div(b: Double) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Float) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Long) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Int) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Short) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Byte) = DoubleVector(shape) { data[it] / b }

    operator fun rem(b: Double) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Float) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Long) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Int) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Short) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Byte) = DoubleVector(shape) { data[it] % b }
    
    /// Primitive Vector Operations
    operator fun plus(b: DoubleVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: FloatVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: LongVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: IntVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: ShortVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: ByteVector) = DoubleVector(shape) { data[it] + b[it] }

    operator fun minus(b: DoubleVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: FloatVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: LongVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: IntVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: ShortVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: ByteVector) = DoubleVector(shape) { data[it] - b[it] }

    operator fun times(b: DoubleVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: FloatVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: LongVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: IntVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: ShortVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: ByteVector) = DoubleVector(shape) { data[it] * b[it] }

    operator fun div(b: DoubleVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: FloatVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: LongVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: IntVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: ShortVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: ByteVector) = DoubleVector(shape) { data[it] / b[it] }

    operator fun rem(b: DoubleVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: FloatVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: LongVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: IntVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: ShortVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: ByteVector) = DoubleVector(shape) { data[it] % b[it] }
    
    /// Broadcasting Assign Operations
    operator fun plusAssign(b: Double) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b) }
    operator fun minusAssign(b: Double) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b) }
    operator fun timesAssign(b: Double) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b) }
    operator fun divAssign(b: Double) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b) }
    operator fun remAssign(b: Double) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b) }
    
    /// Assign Vector Operations
    operator fun plusAssign(b: DoubleVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b[i]) }
    operator fun minusAssign(b: DoubleVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b[i]) }
    operator fun timesAssign(b: DoubleVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b[i]) }
    operator fun divAssign(b: DoubleVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b[i]) }
    operator fun remAssign(b: DoubleVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b[i]) }

    /// Euclidean Distance (Range Operator)
    operator fun rangeTo(other: DoubleVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: FloatVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: LongVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: IntVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: ShortVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: ByteVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })

    /// Component operator (destructuring)
    operator fun component0() = data[0]
    operator fun component1() = data[1]
    operator fun component2() = data[2]
    operator fun component3() = data[3]
    operator fun component4() = data[4]
    operator fun component5() = data[5]
    operator fun component6() = data[6]
    operator fun component7() = data[7]
    operator fun component8() = data[8]
    operator fun component9() = data[9]
}