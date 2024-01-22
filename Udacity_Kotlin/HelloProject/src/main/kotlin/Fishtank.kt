import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt


fun canAddMoreFish(size: Int, tank: Int): Int {
    var fish: Int = 0;
    println("""
        There are some rules to fill the tank with fish. 
        The old inch rules;
        The new fish size rule;
        The aquarium volume;      
    """.trimIndent())
    fun inchesRules(){
        fish = tank /size
    }
    fun sizeRules(){
        when(size) {
            in 0..5 -> 1.5
            in 6..9 -> 2
            in 10..13 -> 3
            else -> 4
        }
    }
    fun tankRules(){
        fish = (tank * 0.15).toInt()
    }
}

fun dayOfWeek(){
    println("What day is today?");
    val date = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    println("Today is " + when(date){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "What universe are we?"
    });
}

fun time(){
    val time = LocalDateTime.now()
    val formatted = DateTimeFormatter.ofPattern("HH:mm")
    println(if (time.hour < 12) "Good Morning, Kotlin" else "Good Night, Kotlin")
    println("Hora local: "+ time.format(formatted));
}
fun feedFish(){
    val day = randomDay();
    val food = feedFood(day)
    println("Today is $day, so the fish eat $food");
}

fun randomDay(): String {
    val weekDays: List<String> = listOf("Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",);
    return weekDays[Random.nextInt(7)]
}
fun feedFood(day: String): String{
    return when(day){
        "Sunday" -> "flakes"
        "Monday" ->  "pellets"
        "Tuesday" -> "red worms"
        "Wednesday" -> "granule"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}