fun main(){
var car=Car("Nissan","Ariya","Grey",14)
    car.carry(30)
    car.identity("grey","subaru","legacy")
    car.calculateParkingFees(24)
    var bus=Bus("Honda","A4","blue",6)
    bus.maxTripFare(350.00)
    bus.calculateParkingFees(12)
}
open class Car(var make: String,var model: String,var color: String,var Capacity: Int){
    fun carry(people: Int) {
    var x = people-Capacity
        if (people==Capacity) {
        }else println("Over capacity by $x people")
        }
   fun identity(color: String, make: String,model: String){
       println("I am $color $make $model")
   }
    open fun calculateParkingFees(hours: Int): Int{
     var product=hours*20
      println(product)
      return product
   }
}
class Bus(make: String, model: String,color: String, Capacity: Int): Car(make, model, color, Capacity) {
    fun maxTripFare(fare: Double): Double {
        var z = 30 * fare
        println(z)
        return z
    }
    override fun calculateParkingFees(hours: Int):Int {
        var product = hours * 12
        println(product)
        return product
    }

}




