fun main(){
    println("номер")
    var N = readLine()!!.toDouble()
    println("1-ый член арифметической прогрессии")
    var a1= readLine()!!.toDouble()
    println("5-ый член арифметической прогрессии")
    var a5= readLine()!!.toDouble()
    var aN:Double
    aN=0.0
    var sum:Double
    sum=0.0
    var d:Double
    d=0.0
    d=(a5-a1)/(5-1)
    aN=a1+(N-1)*d
    sum=((a1+aN)/2)*N
    println(aN)
    println(sum)
}