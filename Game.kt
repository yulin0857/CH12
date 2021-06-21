/*習題3.7*/

import java.lang.Math.pow
import java.lang.Math.random

const val MAX_EXPERIENCE: Int =5000
fun main() {
    val name = "Madrigal"
    val healthPoints = 76
    var isBlessed = true

    val isImmortal = false
    val karma = (pow(random(),(110-healthPoints)/100.0)*20).toInt()

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal, karma)
    val healthStatus = fotmatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(healthPoints, auraColor, isBlessed, name, healthStatus)

    val glass = castFireball(60)
    drink(glass)
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

private fun auraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean,
    karma: Int
): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = auraColor(karma)
    return auraColor
}

private fun auraColor(karma: Int): String {
    val auraColor = when (karma) {
        in 0..5 -> "紅色"
        in 6..10 -> "橘色"
        in 11..15 -> "紫色"
        in 16..20 -> "綠色"
        else -> "無光環"
    }
    return auraColor
}

private fun fotmatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
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
}

    private fun drink(glass: Int){
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
    }

