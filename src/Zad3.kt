fun main()
{
    try {
        print("Введите возраст: ")

        var a = readLine()!!.toInt();

        when(a)
        {
            in 0..2 -> print("младенец")
            in 3..13 -> print("ребенок")
            in 14..17 -> print("подросток")
            in 18..21 -> print("юношеский возраст")
            in 22..59 -> print("средний возраст")
            in 60..74 -> print("пожилой возраст")
            in 75..100 -> print("старческий возраст")
            else -> print ("Число не подходит")
        }
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }

}