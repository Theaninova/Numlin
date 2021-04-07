@file:Suppress("unused")

package vector

import kotlin.math.min

// @formatter:off
inline class DoubleVector(val data: DoubleArray) {
    /// Index Constructor
    constructor(shape: Int, init: (Int) -> Double) : this(DoubleArray(shape) { init(it) })
    constructor(shape: Int) : this(DoubleArray(shape))

    /// Pseudo properties
    val shape get() = data.size

    /// Index Access
    operator fun get(i: Int) = data[i]
    operator fun set(i: Int, value: Double) = run { data[i] = value }
    
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
    operator fun plus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: FloatVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: LongVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: IntVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ShortVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }
    operator fun plus(b: ByteVector) = DoubleVector(min(shape, b.shape)) { data[it] + b[it] }

    operator fun minus(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: FloatVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: LongVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: IntVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ShortVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }
    operator fun minus(b: ByteVector) = DoubleVector(min(shape, b.shape)) { data[it] - b[it] }

    operator fun times(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: FloatVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: LongVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: IntVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ShortVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }
    operator fun times(b: ByteVector) = DoubleVector(min(shape, b.shape)) { data[it] * b[it] }

    operator fun div(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: FloatVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: LongVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: IntVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ShortVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }
    operator fun div(b: ByteVector) = DoubleVector(min(shape, b.shape)) { data[it] / b[it] }

    operator fun rem(b: DoubleVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: FloatVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: LongVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: IntVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ShortVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    operator fun rem(b: ByteVector) = DoubleVector(min(shape, b.shape)) { data[it] % b[it] }
    
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
}