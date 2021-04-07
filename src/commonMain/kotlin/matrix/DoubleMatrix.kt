package matrix

import vector.DoubleVector
import kotlin.math.min

inline class DoubleMatrix(
    val data: Array<DoubleVector>
) {
    constructor(x: Int, y: Int, init: (Int, Int) -> Double) : this(Array(x) { i -> DoubleVector(y) { init(i, it) } })

    /// Double Matrix Operators
    operator fun plus(other: DoubleMatrix): DoubleMatrix =
        DoubleMatrix(Array(min(data.size, other.data.size)) { data[it] + other.data[it] })

    operator fun minus(other: DoubleMatrix): DoubleMatrix =
        DoubleMatrix(Array(min(data.size, other.data.size)) { data[it] + other.data[it] })

    operator fun times(other: DoubleMatrix): DoubleMatrix =
        DoubleMatrix(Array(min(data.size, other.data.size)) { data[it] + other.data[it] })

    operator fun div(other: DoubleMatrix): DoubleMatrix =
        DoubleMatrix(Array(min(data.size, other.data.size)) { data[it] + other.data[it] })

    operator fun rem(other: DoubleMatrix): DoubleMatrix =
        DoubleMatrix(Array(min(data.size, other.data.size)) { data[it] + other.data[it] })


    /// Matrix-specific operations



    /// Index Access
    operator fun get(i: Int): DoubleVector =
        data[i]

    operator fun get(i: Int, j: Int): Double =
        data[i][j]

    operator fun set(i: Int, j: Int, value: Double) {
        data[i][j] = value
    }
}