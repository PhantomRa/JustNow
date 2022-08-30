package ru.netology

class timeToText {
    companion object {
        fun agoToText(time: Int): String {
            return when (time) {
                in 0 until 60 -> "только что"
                in 60 until 60 * 60 -> "в сети ${minutesToText(time / 60)} назад"
                in 60 * 60 until 24 * 60 * 60 -> "в сети ${hoursToText(time / (60 * 60))} назад"
                in 24 * 60 * 60 until 2 * 24 * 60 * 60 -> "сегодня"
                in 2 * 24 * 60 * 60 until 3 * 24 * 60 * 60 -> "вчера"
//                in 3*24*60*60..Int.MAX_VALUE -> "давно"
                else -> "давно"
            }
        }

        private fun minutesToText(minutes: Int): String = when (minutes) {
            1 -> "$minutes минуту"
            in 2..4 -> "$minutes минуты"
            21 -> "$minutes минуту"
            in 22..24 -> "$minutes минуты"
            31 -> "$minutes минуту"
            in 32..34 -> "$minutes минуты"
            41 -> "$minutes минуту"
            in 42..44 -> "$minutes минуты"
            51 -> "$minutes минуту"
            in 52..54 -> "$minutes минуты"
            else -> "$minutes минут"
        }

        private fun hoursToText(hours: Int): String = when (hours) {
            in 2..4 -> "$hours часа"
            in 5..20 -> "$hours часов"
            in 22 until 24 -> "$hours часа"
            else -> "$hours час"
        }
    }
}