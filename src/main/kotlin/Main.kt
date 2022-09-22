
fun main() {
    // NullPointerException (NPE)
    /*
    В Котлине NPE может возникнуть в следующих случаях:
    1) Явно указываете throw NullPointerException()
    2) Использование оператора !!
    3) Вызов какого-то внешнего кода на Java
    ...
     */

    // Nullable ссылка
    // Non-null ссылка

    var a: String = "test" // обычная иници-я non-null значение по умолчанию
    // a = null // ошибка компиляции

    var b: String? = "abc" // здесь могут быть null значения
    b = null

    val l1 = a.length
    // val l2 = b.length
    // 1 вариант
    val l2 = if(b != null) b.length else 0
    // 2 вариант - оператор безопасного вызова ?.
    println(b?.length)
    // 3 вариант
    val l3 = b?.length ?: 0


    // если явно нужно получить NPE
    var k: String = "aaa" // ( non-null)
    val l5 = k!!.length

   // throw NullPointerException();
    // полезный код
   // println("Hello World!")
}