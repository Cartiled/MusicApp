package com.example.musiccompose.ui.theme
import android.graphics.Color.rgb
import android.os.Bundle
import android.util.Printer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background


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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musiccompose.R
import com.example.musiccompose.ui.theme.MusicComposeTheme



class MainActivity : ComponentActivity() {
    val Gainsboro = Color(rgb(220, 220, 220))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LandmusicApp(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Preview
@Composable
fun LandmusicApp(modifier: Modifier = Modifier) {
    var MusicaSonando by remember { mutableStateOf(false) }
    val Gainsboro = Color(rgb(220, 220, 220))
    Box(
        modifier = Modifier
            .fillMaxSize()

            .background(color = Gainsboro)
    ) {


        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 80.dp),
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
                .offset(y = (-80).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ab67616d0000b273c21555708975ad94b1faf422),
                contentDescription = null,
                modifier = Modifier.size(350.dp)
            )
            Spacer(modifier = Modifier.height(60.dp))


        }
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Love.",
                style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold
                )
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Wave to earth",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Left,
                )
                Image(
                    painter = painterResource(R.drawable.add),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }
        }


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 400.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LinearProgressIndicator(
                    progress = { 0.25f },
                    modifier = Modifier
                        .height(8.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    color = Color.Gray,
                    strokeCap = StrokeCap.Round,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
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
            }

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(R.drawable.btn_grey_shuffle_512),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )


                Image(
                    painter = painterResource(R.drawable.btn_grey_goto_first_512),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                )


                Image(
                    painter = painterResource(
                        if (MusicaSonando) R.drawable._0c52538116b504f0d45858a707d0c4f_pause_flat_button
                        else R.drawable.play_flat_icon_752797
                    ),
                    contentDescription = if (MusicaSonando) "Pause" else "Play",
                    modifier = Modifier
                        .size(80.dp)
                        .clickable {
                            MusicaSonando = !MusicaSonando
                        }
                )

                Image(
                    painter = painterResource(R.drawable.btn_grey_next_first_512),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                )

                Image(
                    painter = painterResource(R.drawable.pngtreewhite_single_loop_icon_4557290),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )

            }


        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 700.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LinearProgressIndicator(
                    progress = { 0.75f },
                    modifier = Modifier
                        .height(4.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    color = Color.Gray,
                    strokeCap = StrokeCap.Round,
                )
                Image(
                    painter = painterResource(R.drawable.btn_grey_sound_high_512),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.view_list_512x422),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
                Image(
                    painter = painterResource(R.drawable.pngaaa_com_2360065),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
    }
}