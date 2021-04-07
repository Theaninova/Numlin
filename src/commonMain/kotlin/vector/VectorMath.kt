@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package vector

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
