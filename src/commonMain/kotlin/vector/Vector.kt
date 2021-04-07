package vector

interface Vector {
    fun toDoubleVector(): DoubleVector
    fun toFloatVector(): FloatVector
    fun toLongVector(): LongVector
    fun toIntVector(): IntVector
    fun toShortVector(): ShortVector
    fun toByteVector(): ByteVector
}