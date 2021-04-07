@file:Suppress("unused")

package vector

import kotlin.math.min

// @formatter:off
inline class LongVector(val data: LongArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Long) : this(LongArray(shape) { init(it) })
    constructor(shape: Int) : this(LongArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[i]
    operator fun set(i: Int, value: Long) = run { data[i] = value }
    
    /// Unary operations
    operator fun unaryPlus()  = LongVector(data.size) { +data[it] }
    operator fun unaryMinus() = LongVector(data.size) { -data[it] }
    operator fun inc()        = LongVector(data.size) { data[it]++ }
    operator fun dec()        = LongVector(data.size) { data[it]-- }
    
    /// Broadcast Primitive Operations
    operator fun plus(b: Double) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Float) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Long) = LongVector(shape) { data[it] + b }
    operator fun plus(b: Int) = LongVector(shape) { data[it] + b }
    operator fun plus(b: Short) = LongVector(shape) { data[it] + b }
    operator fun plus(b: Byte) = LongVector(shape) { data[it] + b }

    operator fun minus(b: Double) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Float) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Long) = LongVector(shape) { data[it] - b }
    operator fun minus(b: Int) = LongVector(shape) { data[it] - b }
    operator fun minus(b: Short) = LongVector(shape) { data[it] - b }
    operator fun minus(b: Byte) = LongVector(shape) { data[it] - b }

    operator fun times(b: Double) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Float) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Long) = LongVector(shape) { data[it] * b }
    operator fun times(b: Int) = LongVector(shape) { data[it] * b }
    operator fun times(b: Short) = LongVector(shape) { data[it] * b }
    operator fun times(b: Byte) = LongVector(shape) { data[it] * b }

    operator fun div(b: Double) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Float) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Long) = LongVector(shape) { data[it] / b }
    operator fun div(b: Int) = LongVector(shape) { data[it] / b }
    operator fun div(b: Short) = LongVector(shape) { data[it] / b }
    operator fun div(b: Byte) = LongVector(shape) { data[it] / b }

    operator fun rem(b: Double) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Float) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Long) = LongVector(shape) { data[it] % b }
    operator fun rem(b: Int) = LongVector(shape) { data[it] % b }
    operator fun rem(b: Short) = LongVector(shape) { data[it] % b }
    operator fun rem(b: Byte) = LongVector(shape) { data[it] % b }
    
    /// Primitive Vector Operations
    operator fun plus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: LongVector) = LongVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: IntVector) = LongVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ShortVector) = LongVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ByteVector) = LongVector(min(shape, b.shape)) { data[it] + b[it] }

    operator fun minus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: LongVector) = LongVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: IntVector) = LongVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ShortVector) = LongVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ByteVector) = LongVector(min(shape, b.shape)) { data[it] - b[it] }

    operator fun times(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: LongVector) = LongVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: IntVector) = LongVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ShortVector) = LongVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ByteVector) = LongVector(min(shape, b.shape)) { data[it] * b[it] }

    operator fun div(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: LongVector) = LongVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: IntVector) = LongVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ShortVector) = LongVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ByteVector) = LongVector(min(shape, b.shape)) { data[it] / b[it] }

    operator fun rem(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: LongVector) = LongVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: IntVector) = LongVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ShortVector) = LongVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ByteVector) = LongVector(min(shape, b.shape)) { data[it] % b[it] }
    
    /// Broadcasting Assign Operations
    operator fun plusAssign(b: Long) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b) }
    operator fun minusAssign(b: Long) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b) }
    operator fun timesAssign(b: Long) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b) }
    operator fun divAssign(b: Long) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b) }
    operator fun remAssign(b: Long) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b) }
    
    /// Assign Vector Operations
    operator fun plusAssign(b: LongVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b[i]) }
    operator fun minusAssign(b: LongVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b[i]) }
    operator fun timesAssign(b: LongVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b[i]) }
    operator fun divAssign(b: LongVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b[i]) }
    operator fun remAssign(b: LongVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b[i]) }
}