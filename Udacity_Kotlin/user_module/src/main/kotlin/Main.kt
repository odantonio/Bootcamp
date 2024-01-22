const val POINTS_X_PASS: Int = 15;

val EZPassAccounts: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100);
val EZPassReport: Map<Int,Int> = EZPassAccounts;

fun createAccount(){
    println("Creating a new account");
    val length = EZPassAccounts.size;
    EZPassAccounts[length+1] = 100;
}

fun updatePointsCredit(accountId: Int){
    if (EZPassAccounts.containsKey(accountId)){
        println("updating $accountId...");
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS;
    }else{
        println("trying to update a non-existing account ID: $accountId");
    }
}

fun accountReport(){
    println("EZ-Pass Report:")
    EZPassReport.forEach{ (k, v) -> println("ID: $k,credit: $v");
    }
}

fun main() {
    accountReport();
    updatePointsCredit(1);
    updatePointsCredit(3);
    updatePointsCredit(5);
    createAccount();
    accountReport();
}