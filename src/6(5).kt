fun main(){
    println("x")
    var x= readLine()!!.toDouble()
    println("y")
    var y= readLine()!!.toDouble()
    var rez:Double
    rez=0.0
    rez=Math.sqrt(x+Math.sqrt(Math.pow(x,2.0)+4*Math.pow(y,2.0)))
    println(rez)
}