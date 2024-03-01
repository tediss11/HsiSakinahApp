package com.example.hsisakinah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hsisakinah.ui.theme.HsiSakinahTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HsiSakinahTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FormSakinah()
                }
            }
        }
    }
}

@Composable
fun FormSakinah(
    modifier: Modifier = Modifier
) {
//********************************************** 1
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            painter = painterResource(id = R.drawable.quiz_1___ui_1),
            contentDescription = null,
            modifier = modifier
                .padding(bottom = 40.dp)
        )

//        ******************************************* 2
        Column(
            modifier = modifier
                .background(color = Color.LightGray)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.isi_form_cv),
                modifier = modifier
                    .padding(bottom = 18.dp),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp

            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.keterangan_cv),
                modifier = modifier
                    .padding(bottom = 18.dp),
                fontFamily = FontFamily.Monospace
            )
            Image(
                modifier = modifier
                    .padding(bottom = 18.dp),
                painter = painterResource(id = R.drawable.quiz_1___ui_2_transparan2),
                contentDescription = null
            )
            Row(
                modifier = modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Button(
                    onClick = { },
                    modifier = modifier
                        .padding(end = 24.dp)
                ) {
                    Text(
                        "Lewati",
                        modifier = modifier,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }

                Button(
                    onClick = { },
                    modifier = modifier
                        .padding(start = 24.dp)
                ) {
                    Text(
                        "Isi CV",
                        modifier = modifier,
                        fontSize = 20.sp


                    )
                }
            }
        }

    }

//    ************************************************* 3
    Column(
        modifier = modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = modifier
                .padding(start = 24.dp)
                .padding(end = 24.dp)
                .fillMaxWidth()


        ) {
            Icon(
                imageVector = Icons.Default.Home, contentDescription = "",
                modifier = modifier
                    .weight(1f),
                tint = Color.Gray
            )

            Icon(
                imageVector = Icons.Default.Search, contentDescription = "",
                modifier = modifier
                    .weight(1f),
                tint = Color.Gray,

                )

            Icon(
                imageVector = Icons.Default.Person, contentDescription = "",

                modifier = modifier
                    .weight(1f),
                tint = Color.Gray
            )
        }

        Row(
            modifier = modifier
                .padding(start = 24.dp)
                .padding(end = 24.dp)
                .padding(bottom = 24.dp)
                .fillMaxWidth()

        ) {
            Text(
                textAlign = TextAlign.Center,
                text = "Home",
                color = Color.Gray,
                modifier = modifier
                    .weight(1f)
                    )

            Text(
                textAlign = TextAlign.Center,
                text = "Search",
                color = Color.Gray,
                modifier = modifier
                    .weight(1f)
            )

            Text(
                textAlign = TextAlign.Center,
                text = "Profile",
                color = Color.Gray,
                modifier = modifier
                    .weight(1f)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HsiSakinahTheme {
        FormSakinah()
    }
}