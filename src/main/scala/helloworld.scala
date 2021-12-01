object helloworld {

  def main(args: Array[String]): Unit = {
    println("Hello World welcome to Scala")

    var result = addB(2,3)
    println("Addition of two number is "+result)
  }

  def add(x:Int,y:Int): Int = {
    var z= x+y
    return z

  }

  def addA(x:Int,y:Int): Int = {   //Also return type is optional.
    var z= x+y
    z   // Not mandatory the specify return keyword. If you specify return keyword then you have to mention return type.

  }

  def addB(x:Int,y:Int)=x+y

}
