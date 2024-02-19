fun main() {
    val isRegularCustomer = true
    val itemPrice = 15_000
    val discountMaxPercent = 5
    val discountFix = 100
    val discountForRegularCustomer = 1
    val minValueForFixDiscount = 1_001
    val maxValueForFixDiscount = 10_000

    var resultPrice: Int = if (itemPrice > maxValueForFixDiscount) {
        Math.round(itemPrice * ((100 - discountMaxPercent) / 100.0)).toInt()
    } else if (itemPrice > minValueForFixDiscount) {
        itemPrice - discountFix
    } else itemPrice

    resultPrice = if (isRegularCustomer) {
        Math.round(resultPrice * ((100 - discountForRegularCustomer) / 100.0)).toInt()
    } else resultPrice

    println("Итоговая сумма покупки $resultPrice руб.")

}