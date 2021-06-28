/*習題3.7*/

import java.lang.Math.pow
import java.lang.Math.random

const val MAX_EXPERIENCE: Int =5000
fun main() {
    //val name = "Madrigal"
    //val healthPoints = 89
    //var isBlessed = true
    //val isImmortal = false

    val player=Player()
    player.castFireball(5)

    //aura
    val auraColor = player.auraColor()

    //Player status
    printPlayerStatus(player)

    //aura
    player.auraColor()
}

private fun printPlayerStatus(player: Player)
{
    println("(光環: ${player.auraColor()})"+"(運勢: ${if (player.isBlessed) "走運" else "很背"})")
            println("${player.name} ${player.formatHealthStatus()}")
}



/*private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
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
    return healthStatus
}
private fun castFireball(numFireball: Int = 2): Int{
    println("已喝下$numFireball 杯Fireball")
    return numFireball
}*/

/*private fun drink(glass: Int){
    val drunkenness = when(glass){
        0 -> "清醒"
        in 1..10 -> "微醺"
        in 11..20 -> "微醉"
        in 21..30 -> "醉了"
        in 31..40 -> "大醉"
        in 41..50 -> "爛醉如泥"
        else ->"沒意識"
    }
    println("酒醉狀態:$drunkenness")
}*/

