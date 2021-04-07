@file:Suppress("unused")

package vector

import kotlin.math.min

// @formatter:off
inline class FloatVector(val data: FloatArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Float) : this(FloatArray(shape) { init(it) })
    constructor(shape: Int) : this(FloatArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[i]
    operator fun set(i: Int, value: Float) = run { data[i] = value }
    
    /// Unary operations
    operator fun unaryPlus()  = FloatVector(data.size) { +data[it] }
    operator fun unaryMinus() = FloatVector(data.size) { -data[it] }
    operator fun inc()        = FloatVector(data.size) { data[it]++ }
    operator fun dec()        = FloatVector(data.size) { data[it]-- }
    
    /// Broadcast Primitive Operations
    operator fun plus(b: Double) = DoubleVector(shape) { data[it] + b }
    operator fun plus(b: Float) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Long) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Int) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Short) = FloatVector(shape) { data[it] + b }
    operator fun plus(b: Byte) = FloatVector(shape) { data[it] + b }

    operator fun minus(b: Double) = DoubleVector(shape) { data[it] - b }
    operator fun minus(b: Float) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Long) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Int) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Short) = FloatVector(shape) { data[it] - b }
    operator fun minus(b: Byte) = FloatVector(shape) { data[it] - b }

    operator fun times(b: Double) = DoubleVector(shape) { data[it] * b }
    operator fun times(b: Float) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Long) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Int) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Short) = FloatVector(shape) { data[it] * b }
    operator fun times(b: Byte) = FloatVector(shape) { data[it] * b }

    operator fun div(b: Double) = DoubleVector(shape) { data[it] / b }
    operator fun div(b: Float) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Long) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Int) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Short) = FloatVector(shape) { data[it] / b }
    operator fun div(b: Byte) = FloatVector(shape) { data[it] / b }

    operator fun rem(b: Double) = DoubleVector(shape) { data[it] % b }
    operator fun rem(b: Float) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Long) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Int) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Short) = FloatVector(shape) { data[it] % b }
    operator fun rem(b: Byte) = FloatVector(shape) { data[it] % b }
    
    /// Primitive Vector Operations
    operator fun plus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: LongVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: IntVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ShortVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ByteVector) = FloatVector(min(shape, b.shape)) { data[it] + b[it] }

    operator fun minus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: LongVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: IntVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ShortVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ByteVector) = FloatVector(min(shape, b.shape)) { data[it] - b[it] }

    operator fun times(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: LongVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: IntVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ShortVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ByteVector) = FloatVector(min(shape, b.shape)) { data[it] * b[it] }

    operator fun div(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: LongVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: IntVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ShortVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ByteVector) = FloatVector(min(shape, b.shape)) { data[it] / b[it] }

    operator fun rem(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: FloatVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: LongVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: IntVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ShortVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ByteVector) = FloatVector(min(shape, b.shape)) { data[it] % b[it] }
    
    /// Broadcasting Assign Operations
    operator fun plusAssign(b: Float) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b) }
    operator fun minusAssign(b: Float) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b) }
    operator fun timesAssign(b: Float) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b) }
    operator fun divAssign(b: Float) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b) }
    operator fun remAssign(b: Float) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b) }
    
    /// Assign Vector Operations
    operator fun plusAssign(b: FloatVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] + b[i]) }
    operator fun minusAssign(b: FloatVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] - b[i]) }
    operator fun timesAssign(b: FloatVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] * b[i]) }
    operator fun divAssign(b: FloatVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] / b[i]) }
    operator fun remAssign(b: FloatVector) = data.forEachIndexed { i, _ -> data[i] = (data[i] % b[i]) }
}