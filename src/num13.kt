fun main() {
    println("сторона а")
    var a = readLine()!!.toDouble()
    println("сторона б")
    var b = readLine()!!.toDouble()
    println("сторона с")
    var c = readLine()!!.toDouble()
    var p: Double
    p = 0.0
    var h: Double
    h = 0.0
    var m: Double
    m = 0.0
    var Beta: Double
    Beta = 0.0
    p=(a+b+c)/2
    h=(2/a)*Math.sqrt(p*(p-a)*(p-b)*(p-c))
    m=(1/2)*Math.sqrt(2*Math.pow(b,2.0)*2*Math.pow(c,2.0)-Math.pow(a,2.0))
    Beta=(2*Math.sqrt(b*c*p*(p-a)))/b+c
    println(p)
    println(h)
    println(m)
    println(Beta)
}