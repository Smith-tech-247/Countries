package com.example.walmartapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CountryDataLayout(country: Country) {
    country.let {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp, horizontal = 4.dp)
                .testTag("country_card"),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(width = 2.dp, color = Color.Black),
            colors = CardDefaults.cardColors().copy(
                contentColor = Color.Blue
            )
        ) {
            Column(modifier = Modifier
                .testTag("country_column")) {
                FlowRow(
                    modifier = Modifier
                        .testTag("country_flow_row")
                        .padding(8.dp),
                ) {
                    Text(
                        modifier = Modifier
                            .padding(horizontal = 4.dp, vertical = 4.dp),
                        text = "${it.name},",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 8.dp, end = 4.dp, top = 4.dp, bottom = 4.dp),
                        text = it.region,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        modifier = Modifier
                            .padding(horizontal = 4.dp, vertical = 4.dp),
                        text = " ${it.code}",
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            }
                Text(
                    text = " ${it.capital}",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                      .padding(horizontal = 4.dp, vertical = 8.dp),
                )
            }
        }
}
