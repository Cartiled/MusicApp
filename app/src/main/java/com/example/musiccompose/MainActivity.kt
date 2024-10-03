package com.example.musiccompose


import android.os.Bundle
import android.util.Printer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size


import androidx.compose.foundation.shape.RoundedCornerShape


import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musiccompose.ui.theme.MusicComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    musicApp(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
@Composable
fun musicApp(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
    ) {


        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "0.1 Flaws and All",
                style = TextStyle(
                    fontSize = 27.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Monospace,
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-60).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ab67616d0000b273c21555708975ad94b1faf422),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Spacer(modifier = Modifier.height(60.dp))


        }
        Column (
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Love.",
                style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "Wave to earth",
                fontSize = 16.sp,
                textAlign = TextAlign.Left,
            )
        }


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 400.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {




            LinearProgressIndicator(
                progress = 0.25f,
                color = Color.Gray,
                modifier = Modifier
                    .height(8.dp)
                    .clip(RoundedCornerShape(16.dp)),
                strokeCap = StrokeCap.Round
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "0:47", style = TextStyle(
                        fontSize = 12.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    text = "5:07", style = TextStyle(
                        fontSize = 12.sp,
                        textAlign = TextAlign.Right
                    )
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.play_flat_icon_752797),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .clickable {


                        }
                )
                Image(
                    painter = painterResource(R.drawable._0c52538116b504f0d45858a707d0c4f_pause_flat_button),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                )
            }
        }
    }
}


