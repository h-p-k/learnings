import scala.collection.immutable.Map

val m = Map(1 -> 2, 2 -> 3)

m.valuesIterator.foreach(v => print(v + " "))
println()

m.keysIterator.foreach(k => print(k + " "))
println()
println()

val n = m.transform((k, v) => { v*v } )

n.valuesIterator.foreach(v => print(v + " "))
println()

n.keysIterator.foreach(k => print(k + " "))
println()

