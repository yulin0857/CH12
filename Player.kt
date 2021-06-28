import java.util.*

class Player {
    var name = "madrigal"
        get() = field.capitalize()
        //get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        private set(value){
            field = value.trim()
        }
    val healthPoints = 89
    var isBlessed = true
    private val isImmortal = false


    fun auraColor():String
    {
        val auraVisible=isBlessed&&healthPoints>50 ||isImmortal
        val auraColor = if (auraVisible)"綠色" else "無光環"
        return auraColor
    }


    fun formatHealthStatus()=when (healthPoints)
    {
        100 -> "健康狀態極佳"
        in 90..99 -> "有一些小擦傷"
        in 75..89 -> if (isBlessed) {
            "雖有一些傷口，但恢復很快"
        } else {
            "有一些傷口"
        }
        in 15..74 -> "嚴重受傷"
        //顯示玩家狀態
        else -> "情況不妙"
    }
    private fun printPlayerStatus(
        healthPoints: Int,
        auraColor: String,
        isBlessed: Boolean,
        name: String,
        healthStatus: String
    ) {
        val statusFormatString =
            "(健康指數: $healthPoints)(光環: $auraColor)(運勢: ${if (isBlessed) "走運" else "很背"}) -> $name $healthStatus"
        println(statusFormatString)
    }

    fun castFireball(numFireballs: Int=2)=
        println("橫空出現一杯火球.(x$numFireballs)")

}