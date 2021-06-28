import java.util.*

class Player {
    var name = "madrigal"
        get() = field.capitalize()
        //get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        private set(value){
            field  value.trim()
        }


    fun castFireball(numFireballs: Int=2)=
        println("橫空出現一杯火球.(x$numFireballs)")

}