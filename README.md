# Numlin

Numlin is a Kotlin-first Math library similar to Numpy.

## Features

### Vector Math

* **Operator overloads** implemented for all (sensible) element-wise operations, including all overloads for every type
combination of types and assignment operations
  
* **Inline Classes**, so a vector is exactly a `double[]`, `float[]`, etc. at runtime with no additional boxing

* **Primitive Java Types** `double`, `float`, `long`, `int`, `short`, and `byte`
  are used for all vectors types, no unnecessary boxing

* **infix functions** or **extension properties** for Common Vector Operations like
  `length`, `distance`, `dot`, `dot2`, `T` (transpose)

* (TODO) Element-wise operation overloads for `sin`, `cos`, etc.

* **Index Access** overloads:
  * Basic access `vector[0]`
  * Negative Index to access elements from behind    
  * Slicing `vector[0..3]`, `vector[0 until 3 step 2]`
  * Rearranging `vector[vec(1, 2, 6, 3)]`
  * Filtering `vector[booleanArrayOf(true, false, false)]`

* **Generator Constructor**, where `DoubleVector(5) { it * 2 }` evaluates to `[2, 4, 6, 8, 10]`

* **GLSL Style Component Swizzling** `vector.xy + vector.yx`

### Matrix Math

TODO;
