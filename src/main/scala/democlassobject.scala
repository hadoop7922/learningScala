//acccess level in Scala
//public can access any where. By default it is public.
//private can access only in the class it is defined.
//Protected can access in class it is defined as well as in subclass extending the given class using inheritance.


class taxcalculator{
  var a = "Abhi"
  var b = "Lash"
  var income = 200

  def tax(taxrate:Float,income:Int)=taxrate*income
}

object democlassobject {

  def main(args: Array[String]): Unit = {
    println("Hello DemoClassObject.!!")

    var t= new taxcalculator // creating class object
    println(t.a)
    println(t.b)
    t.income=400
    println(t.tax(0.4f,t.income))
  }

}
