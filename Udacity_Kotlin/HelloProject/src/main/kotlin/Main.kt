
import kotlin.random.Random

fun main() {
    val b = getBirthDay()
    val a = getFortuneCookie(b);
    println("Your fortune is: $a")
//    for(i in 1..10){
//        val b = getBirthDay()
//        val a = getFortuneCookie(b);
//        if (a == "Take it easy and enjoy life!") {
//            println("Your fortune is: $a")
//            break
//        }
//    }
    feedFish();
//
    dayOfWeek();
    time();
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}");
}

fun getFortuneCookie(date: Int): String{
    val fortuneList: List<String> = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",);
    return when(date){
        28, 31 ->  "An exciting opportunity lies ahead of you."
        in 1..7 -> "You should be able to undertake and complete anything."
        else -> {
            val seed = date % fortuneList.size
            fortuneList[Random.nextInt(seed)];
        }
    }
}

fun getBirthDay():Int{
    print("Enter you birthday: ");
    val birthday: Int = readlnOrNull()?.toIntOrNull() ?: 1;
    return birthday
}
