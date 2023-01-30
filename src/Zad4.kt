fun main()
{
    try
    {
        print("Введите x: ")

        var x = readLine()!!.toDouble()
        var result: Double = 0.0

        if (x > 1.1) result = 9.0 - x
        else if(x < -1.1) result = (Math.sin(3.0 * x)) / (Math.pow(x, 4.0) + 1.0)
        else println("Выражения для такого диапозона нет")
        println("$result")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}