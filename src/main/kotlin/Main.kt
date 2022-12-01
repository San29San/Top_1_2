fun main(args: Array<String>) {

    // <, >, <=, >=, ==, !=
    //val text = readln()
    //if (text.length <= 5) {
    //    println("length valid")
    // }

    /////////////////////////////

    // val num = 100
    // if (num > 20) {
    //     if (num < 150) {
    //        print("< 150")
    //    }
    //    print("> 20")
    //}

    ///////////////////////
    /// определить знак числа

    // println("введите число")
    // val a = readln().toInt()
    // if (a > 0) {
    //     println("Positive")
    // } else {
    //    if (a == 0) {
    //        println("variable is mull")
    //    } else {
    //        println("Is negative")
    //    }
    // }

    ///Вычисление периметра треугольника
    // && - логическое И
    // || - логическое ИЛИ

    // println("Вычисление перметра треугольника")
    // println("Введите длину первой стороны")
    // val side1 = readln().toInt()
    // println("Введите длину второй стороны")
    // val side2 = readln().toInt()
    // println("Введите длину третьей стороны")
    // val side3 = readln().toInt()

    //if (side1 + side2 > side3 &&
    //   side2 + side3 > side1 &&
    //   side1 + side3 > side2
    // ) {
    //   println("Perimeter: ${side1 + side2 + side3}")
    //} else {
    //    println("Not exist!!!")
    // }
    // witn ||
    // нахождение пройденного пути
    // println("нахождение пройденного пути")
    // println("Введите v")
    // val v = readln().toInt()
    // println("Введите t")
    // val t = readln().toInt()
    // if (v < 0 || t < 0) {
    //     println("Введите корректные данные")
    // } else {
    //     val s = v * t
    //     println("расстояние ${v * t}")
    // }

    // найти большее число
    //println("нахождение наибольшего числа")
    //println("введите первое число")
    //val num1 = readln().toInt()
    //println("введите второе число")
    //val num2 = readln().toInt()
    //if (num1 > num2) {
    //    println("num1 > num2")
    //} else if (num1 < num2) {
    //    println("num1 < num2")
    //}
    //else {
    //    println("num1 = num2")
    // }

   // var num = 1
  //  while (num <= 100){
    //    println(num)
    //    num ++
    //}

    //var num = 1
    //while(num <= 10){
    //   println(num)
    //   num ++
    for (i in 1..100){
        println(i)
    }

    for (i in 100 downTo 0){
        println(i)
    }
    for (i in 100 downTo 0 step 5){
        println(i)
    }

}