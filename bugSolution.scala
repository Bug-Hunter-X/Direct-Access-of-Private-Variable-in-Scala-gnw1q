```scala
class MyClass {
  private var privateVar: Int = 0

  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  def accessPrivateVar(): Int = {
    privateVar
  }
}

object Main extends App {
  val obj = new MyClass()
  obj.updatePrivateVar(10)
  println(obj.accessPrivateVar())
}
```