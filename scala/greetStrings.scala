//val greetStrings = new Array[String](3)
//val greetStrings = Array("Hello", ", ", "world!\n")
val greetStrings = Array.apply("Hello", ", ", "world!\n")

//greetStrings(0) = "Hello"
//greetStrings(1) = ", "
//greetStrings(2) = "world!\n"
//greetStrings.update(0, "Hello")
//greetStrings.update(1, ", ")
//greetStrings.update(2, "world!\n")


for (i <- 0 to greetStrings.length - 1)
 print(greetStrings.apply(i))

