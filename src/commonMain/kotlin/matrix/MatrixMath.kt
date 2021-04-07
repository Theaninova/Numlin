package matrix

import vector.DoubleVector

/// Transpose
val DoubleVector.T get() = DoubleMatrix(shape, 1) { x, _ -> data[x] }