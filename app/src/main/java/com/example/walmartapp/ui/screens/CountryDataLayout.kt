package com.example.walmartapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.walmartapp.model.Country

@Composable
fun CountryDataLayout(country: Country) {
    country.let {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
                .testTag("country_card"),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(width = 2.dp, color = Color.Black),
            colors = CardDefaults.cardColors().copy(
                contentColor = Color.Blue
            )
        ) {
            Column(modifier = Modifier
                .testTag("country_column")) {
                Row(modifier = Modifier
                    .testTag("country_column")) {
                    Text(
                        text = "${it.name},",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                           .padding(horizontal = 8.dp, vertical = 8.dp),
                    )
                    Text(
                        text = it.region,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier
                          .padding(horizontal = 8.dp, vertical = 8.dp),
                    )
                    Text(
                        text = " ${it.code}",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp),
                    )
                }
                Text(
                    text = " ${it.capital}",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                      .padding(horizontal = 4.dp),
                )
            }
        }
    }
}
