package complex

class ComplexDouble(
    val real: Double,
    val complex: Double,
) {
    /// Base Operations
    operator fun plus(other: Double): ComplexDouble = ComplexDouble(real + other, complex)
    operator fun minus(other: Double): ComplexDouble = ComplexDouble(real - other, complex)
    operator fun times(other: Double): ComplexDouble = ComplexDouble(real * other, complex)
    operator fun div(other: Double): ComplexDouble = ComplexDouble(real / other, complex)
    operator fun rem(other: Double): ComplexDouble = ComplexDouble(real % other, complex)

    operator fun plus(other: ComplexDouble): ComplexDouble = ComplexDouble(real + other.real, complex + other.complex)
    operator fun minus(other: ComplexDouble): ComplexDouble = ComplexDouble(real - other.real, complex - other.complex)
    operator fun times(other: ComplexDouble): ComplexDouble = ComplexDouble(
        real * other.real - complex * other.complex,
        real * other.complex + complex * other.real,
    )
    // operator fun div(other: ComplexDouble): ComplexDouble = ComplexDouble(real / other.real, complex)
    // operator fun rem(other: ComplexDouble): ComplexDouble = ComplexDouble(real % other.real, complex)
}