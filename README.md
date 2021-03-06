# Numlin

Numlin is a WIP Kotlin Math library similar to Numpy, that provides a very intuitive way
to interact with Vectors and Matrices while introducing close to no runtime overhead compared
to a Java implementation with primitive arrays.

## Features

### Vector Math

* **Operator overloads** implemented for all (sensible) element-wise operations, including all overloads for every type
combination of types and assignment operations
  
* **Inline Classes**, so a vector is exactly a `double[]`, `float[]`, etc. at runtime with no additional boxing

* **Primitive Java Types** `double`, `float`, `long`, `int`, `short`, and `byte`
  are used for all vectors types, no unnecessary boxing

* **infix functions** or **extension properties** for Common Vector Operations like
  `length`, `dot`, `dot2`, `T` (transpose)

* (TODO) Element-wise operation overloads for `sin`, `cos`, etc.

* **Index Access** overloads:
  * Basic access `vector[0]`
  * Negative Index to access elements from behind    
  * Slicing `vector[0..3]`, `vector[0 until 3 step 2]`
  * Rearranging `vector[vec(1, 2, 6, 3)]`
  * Filtering `vector[booleanArrayOf(true, false, false)]`

* **Generator Constructor**, where `DoubleVector(5) { it * 2 }` evaluates to `[2, 4, 6, 8, 10]`

* **Up to 4D GLSL Style Component Swizzling** `vector.xy + vector.yx`

#### Examples

* Operator Overloads
```kotlin
val a = vec(1, 0, 0)
val b = vec(0, 1, 0)

val distance = a..b // euclidean distance
val c = a.xy + b.yx

val d = vec(1, 2, 3, 4, 5, 6, 7, 8)
val e = d[1..7 step 2] // [2, 4, 6, 8]

val (x, y) = a
```

#### Vector Operations List

*Warning: all of these functions assume both vectors are compatible, aka same-sized*

| Type \ Operator  |  Scalar | Vector | Matrix |
| --------- | ------------ | ------- | ----- |
| `+` |  Add to each element  | Element-wise add |  |
| `-` |  Subtract from each element  | Element-wise subtract | |
| `*` |  Scale Vector  | Element-wise multiplication | |
| `/` |  Scale Vector  | Element-wise division | |
| `%` |  Modulo each element | Element-wise modulo | |
| `..` |   | Distance (Euclidean Norm) | |
| `dot` |   | Dot Product | |
| `==`, `!=`, `>`, `<`, `>=`, `<=` | TODO; | TODO; | |
| `in`, `!in` | TODO; | TODO; |

*All of these properties cause computation on every call*

| Property | Description |
| ----- | ----- |
| `T` | Transpose Vector |
| `length` | Euclidean Length of the vector |
| `sum` | The sum of all elements |
| `dot2` | Same as `a dot a` |
| `normalized` | Vector normalized to length 1 |
| `shape` | Size of vector |
| `(...x)` (`invoke`) | Returns a new array according to the indices passed *Note: I'm unsure if I should keep this* |

*Any function with a lambda parameter is an inline function*

| Function | Description |
| ----- | ---- |
| `applyMap((Number) -> Number): Self` | Apply-assign a function to each element, does not create a new array |
| `map((Number) -> Number): Copy` | Apply a function to each element in a new array |

### Matrix Math

TODO;

### Complex Numbers

TODO;

Can be created like this `1 + 2.j`
