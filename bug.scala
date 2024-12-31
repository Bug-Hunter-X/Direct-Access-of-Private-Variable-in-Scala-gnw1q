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
  obj.updatePrivateVar(10) // this is fine
  println(obj.accessPrivateVar()) // this works fine, but the next line causes the issue
  // obj.privateVar = 20 // this will fail to compile
  println(obj.privateVar) //this is an attempt to access the private variable directly
}
```