package com.example.a90teamsports_premierleague.data

import com.example.a90teamsports_premierleague.R
import com.example.a90teamsports_premierleague.data.model.Trikot

class DataSource {

    fun getTrikot(): List<Trikot> {
        return listOf(
            Trikot(
                "FC Arsenal",
                69.50,
                "Adidas",
                R.drawable.team1
            ),
            Trikot(
                "Manchester City",
                74.90,
                "Puma",
                R.drawable.team2_jpg
            ),
            Trikot(
                "FC Chelsea",
                64.50,
                "Nike",
                R.drawable.team3
            ),
            Trikot(
                "Newcastle United",
                74.90,
                "Castore",
                R.drawable.team4

            ),
            Trikot(
                "Manchester United",
                69.50,
                "Adidas",
                R.drawable.team5

            )
        )
    }
}