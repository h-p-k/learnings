var s = Set("hi", "there")
s += "yes"
s += "hello"

import scala.collection.mutable

val t = mutable.Set("hi", "there")
t += "yes"

t.foreach(x => print(x + " "))

println()

//t("yes") = false
//t -= "yes"
t += "hello"

t.foreach(x => print(x + " "))

println()
