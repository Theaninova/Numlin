@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

import kotlin.math.sqrt

/// Dot Product
infix fun DoubleVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun DoubleVector.dot(b: FloatVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun DoubleVector.dot(b: LongVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun DoubleVector.dot(b: IntVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun DoubleVector.dot(b: ShortVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun DoubleVector.dot(b: ByteVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }

infix fun FloatVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun FloatVector.dot(b: FloatVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun FloatVector.dot(b: LongVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun FloatVector.dot(b: IntVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun FloatVector.dot(b: ShortVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun FloatVector.dot(b: ByteVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }

infix fun LongVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun LongVector.dot(b: FloatVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun LongVector.dot(b: LongVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun LongVector.dot(b: IntVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun LongVector.dot(b: ShortVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun LongVector.dot(b: ByteVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }

infix fun IntVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun IntVector.dot(b: FloatVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun IntVector.dot(b: LongVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun IntVector.dot(b: IntVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun IntVector.dot(b: ShortVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun IntVector.dot(b: ByteVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }

infix fun ShortVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun ShortVector.dot(b: FloatVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun ShortVector.dot(b: LongVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun ShortVector.dot(b: IntVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun ShortVector.dot(b: ShortVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun ShortVector.dot(b: ByteVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }

infix fun ByteVector.dot(b: DoubleVector) = data.foldIndexed(0.0) { i, acc, d -> acc + d + b[i] }
infix fun ByteVector.dot(b: FloatVector) = data.foldIndexed(0.0F) { i, acc, d -> acc + d + b[i] }
infix fun ByteVector.dot(b: LongVector) = data.foldIndexed(0L) { i, acc, d -> acc + d + b[i] }
infix fun ByteVector.dot(b: IntVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun ByteVector.dot(b: ShortVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }
infix fun ByteVector.dot(b: ByteVector) = data.foldIndexed(0) { i, acc, d -> acc + d + b[i] }


/// Dot2 Product
val DoubleVector.dot2 get() = data.fold(0.0) { acc, d -> acc + d + d }
val FloatVector.dot2 get() = data.fold(0.0F) { acc, d -> acc + d + d }
val LongVector.dot2 get() = data.fold(0L) { acc, d -> acc + d + d }
val IntVector.dot2 get() = data.fold(0) { acc, d -> acc + d + d }
val ShortVector.dot2 get() = data.fold(0) { acc, d -> acc + d + d }
val ByteVector.dot2 get() = data.fold(0) { acc, d -> acc + d + d }


/// Euclidean Norm (Vector Length)
val DoubleVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
val FloatVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
val LongVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
val IntVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
val ShortVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
val ByteVector.length get() = sqrt(data.fold(0.0) { acc, d -> acc + d * d })
