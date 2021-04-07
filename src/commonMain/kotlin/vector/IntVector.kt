@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

import kotlin.math.sqrt

// @formatter:off
inline class IntVector(val data: IntArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Int) : this(IntArray(shape) { init(it) })
    constructor(shape: Int) : this(IntArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[i]
    operator fun set(i: Int, value: Int) = run { data[i] = value }
    
    /// Unary operations
    operator fun unaryPlus()  = IntVector(data.size) { +data[it] }
    operator fun unaryMinus() = IntVector(data.size) { -data[it] }
    operator fun inc()        = IntVector(data.size) { data[it]++ }
    operator fun dec()        = IntVector(data.size) { data[it]-- }
    
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
    operator fun plusAssign(b: Int) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b) }
    operator fun minusAssign(b: Int) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b) }
    operator fun timesAssign(b: Int) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b) }
    operator fun divAssign(b: Int) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b) }
    operator fun remAssign(b: Int) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b) }
    
    /// Assign Vector Operations
    operator fun plusAssign(b: IntVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b[i]) }
    operator fun minusAssign(b: IntVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b[i]) }
    operator fun timesAssign(b: IntVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b[i]) }
    operator fun divAssign(b: IntVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b[i]) }
    operator fun remAssign(b: IntVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b[i]) }

    /// Euclidean Distance (Range Operator)
    operator fun rangeTo(other: DoubleVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: FloatVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: LongVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: IntVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: ShortVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
    operator fun rangeTo(other: ByteVector) = sqrt(data.foldIndexed(0.0) { i, acc, d -> acc + (d - other[i]).let { it * it } })
}