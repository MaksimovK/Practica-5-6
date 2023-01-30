fun main()
{
    try
    {
        println("Введите два числа")

        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()

        if(a > b)
            a++
        else if (a < b)
            b++
        else if (a == b)
            a = Math.pow(a, 3.0)
        println("$a $b")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}

