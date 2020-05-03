val l = List(1, 2, 3)

println(l.apply(1))
// 1 2 3 4
val a = List(1, 2)
val b = List(3, 4)

val c = a ::: b

c.foreach(x => print(x +" "))

println()

// 1 2 3 4 1 1 2
val d = c ::: 1 :: a

d.foreach(x => print(x + " "))
println()

// cons 1 2 3 4
val e = 1 :: 2 :: 3 :: 4 :: Nil

e.foreach(x => print(x + " "))
println()

// appends 1 2 1 2
val f = a :+ b

f.foreach(x => print(x + " "))

println()

val g = a +: b

g.foreach(x => print(x + " "))

println()

//val h = a :++ b

//h.foreach(x => print(x + " "))

val i = a ++: b

i.foreach(x => print(x + " "))

println()

