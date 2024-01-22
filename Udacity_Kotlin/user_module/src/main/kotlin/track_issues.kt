val openIssues: MutableSet<String> = mutableSetOf("descript1", "descript2", "descript3");

fun addIssue(uniqueDescr: String): Boolean{
        return openIssues.add(uniqueDescr);
}

fun getStatus(isAdded: Boolean): String{
    return if (isAdded) {
        "registered correctly";
    }else {
        "marked as duplicated and rejected";
    }
}

fun main(){
    val newIssue: String = "uniqueDescr4";
    val alreadyIssue: String = "descript2";
    var issue: Boolean = false;

    issue = addIssue(newIssue);
    println("Issue $newIssue ${getStatus(issue)}");

    issue = addIssue(alreadyIssue);
    println("Issue $alreadyIssue ${getStatus(issue)}");
}