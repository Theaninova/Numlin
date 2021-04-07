@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

import kotlin.math.min
import kotlin.math.sqrt

// @formatter:off
inline class ByteVector(val data: ByteArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Byte) : this(ByteArray(shape) { init(it) })
    constructor(shape: Int) : this(ByteArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[min(i, data.size + i)]
    operator fun set(i: Int, value: Byte) = run { data[min(i, data.size + i)] = value }
    operator fun get(i: IntProgression) = ByteVector((i.last - i.first + 1) / i.step) { get(it) }
    
    /// Unary operations
    operator fun unaryPlus()  = IntVector(data.size) { +data[it] }
    operator fun unaryMinus() = IntVector(data.size) { -data[it] }
    operator fun inc()        = ByteVector(data.size) { data[it]++ }
    operator fun dec()        = ByteVector(data.size) { data[it]-- }
    
    /// Broadcast Primitive Operations
    operator fun plus(b: Double) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Float) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Long) = LongVector(shape) { data[it] + b }
    operator fun plus(b: Int) = IntVector(shape) { data[it] + b }
    operator fun plus(b: Short) = IntVector(shape) { data[it] + b }
    operator fun plus(b: Byte) = IntVector(shape) { data[it] + b }

    operator fun minus(b: Double) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Float) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Long) = LongVector(shape) { data[it] - b }
    operator fun minus(b: Int) = IntVector(shape) { data[it] - b }
    operator fun minus(b: Short) = IntVector(shape) { data[it] - b }
    operator fun minus(b: Byte) = IntVector(shape) { data[it] - b }

    operator fun times(b: Double) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Float) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Long) = LongVector(shape) { data[it] * b }
    operator fun times(b: Int) = IntVector(shape) { data[it] * b }
    operator fun times(b: Short) = IntVector(shape) { data[it] * b }
    operator fun times(b: Byte) = IntVector(shape) { data[it] * b }

    operator fun div(b: Double) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Float) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Long) = LongVector(shape) { data[it] / b }
    operator fun div(b: Int) = IntVector(shape) { data[it] / b }
    operator fun div(b: Short) = IntVector(shape) { data[it] / b }
    operator fun div(b: Byte) = IntVector(shape) { data[it] / b }

    operator fun rem(b: Double) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Float) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Long) = LongVector(shape) { data[it] % b }
    operator fun rem(b: Int) = IntVector(shape) { data[it] % b }
    operator fun rem(b: Short) = IntVector(shape) { data[it] % b }
    operator fun rem(b: Byte) = IntVector(shape) { data[it] % b }
    
    /// Primitive Vector Operations
    operator fun plus(b: DoubleVector) = DoubleVector(shape) { data[it] + b[it] }
    operator fun plus(b: FloatVector) = FloatVector(shape) { data[it] + b[it] }
    operator fun plus(b: LongVector) = LongVector(shape) { data[it] + b[it] }
    operator fun plus(b: IntVector) = IntVector(shape) { data[it] + b[it] }
    operator fun plus(b: ShortVector) = IntVector(shape) { data[it] + b[it] }
    operator fun plus(b: ByteVector) = IntVector(shape) { data[it] + b[it] }

    operator fun minus(b: DoubleVector) = DoubleVector(shape) { data[it] - b[it] }
    operator fun minus(b: FloatVector) = FloatVector(shape) { data[it] - b[it] }
    operator fun minus(b: LongVector) = LongVector(shape) { data[it] - b[it] }
    operator fun minus(b: IntVector) = IntVector(shape) { data[it] - b[it] }
    operator fun minus(b: ShortVector) = IntVector(shape) { data[it] - b[it] }
    operator fun minus(b: ByteVector) = IntVector(shape) { data[it] - b[it] }

    operator fun times(b: DoubleVector) = DoubleVector(shape) { data[it] * b[it] }
    operator fun times(b: FloatVector) = FloatVector(shape) { data[it] * b[it] }
    operator fun times(b: LongVector) = LongVector(shape) { data[it] * b[it] }
    operator fun times(b: IntVector) = IntVector(shape) { data[it] * b[it] }
    operator fun times(b: ShortVector) = IntVector(shape) { data[it] * b[it] }
    operator fun times(b: ByteVector) = IntVector(shape) { data[it] * b[it] }

    operator fun div(b: DoubleVector) = DoubleVector(shape) { data[it] / b[it] }
    operator fun div(b: FloatVector) = FloatVector(shape) { data[it] / b[it] }
    operator fun div(b: LongVector) = LongVector(shape) { data[it] / b[it] }
    operator fun div(b: IntVector) = IntVector(shape) { data[it] / b[it] }
    operator fun div(b: ShortVector) = IntVector(shape) { data[it] / b[it] }
    operator fun div(b: ByteVector) = IntVector(shape) { data[it] / b[it] }

    operator fun rem(b: DoubleVector) = DoubleVector(shape) { data[it] % b[it] }
    operator fun rem(b: FloatVector) = FloatVector(shape) { data[it] % b[it] }
    operator fun rem(b: LongVector) = LongVector(shape) { data[it] % b[it] }
    operator fun rem(b: IntVector) = IntVector(shape) { data[it] % b[it] }
    operator fun rem(b: ShortVector) = IntVector(shape) { data[it] % b[it] }
    operator fun rem(b: ByteVector) = IntVector(shape) { data[it] % b[it] }
    
    /// Broadcasting Assign Operations
    operator fun plusAssign(b: Byte) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b).toByte() }
    operator fun minusAssign(b: Byte) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b).toByte() }
    operator fun timesAssign(b: Byte) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b).toByte() }
    operator fun divAssign(b: Byte) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b).toByte() }
    operator fun remAssign(b: Byte) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b).toByte() }
    
    /// Assign Vector Operations
    operator fun plusAssign(b: ByteVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b[i]).toByte() }
    operator fun minusAssign(b: ByteVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b[i]).toByte() }
    operator fun timesAssign(b: ByteVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b[i]).toByte() }
    operator fun divAssign(b: ByteVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b[i]).toByte() }
    operator fun remAssign(b: ByteVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b[i]).toByte() }

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